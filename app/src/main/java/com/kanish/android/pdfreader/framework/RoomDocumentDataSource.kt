package com.kanish.android.pdfreader.framework

import android.content.Context
import com.kanish.android.pdfreader.framework.db.DocumentEntity
import com.kanish.android.pdfreader.framework.db.MajesticReaderDatabase
import com.kash.core.data.BookMarkDataSource
import com.kash.core.data.DocumentDataSource
import com.kash.core.domain.Document

/**
 * Created by Kanish Roshan on 27/05/21.
 */
class RoomDocumentDataSource(private val context: Context) :DocumentDataSource{
    private  val documentDao=MajesticReaderDatabase.getInstance(context).documentDao()
    override suspend fun add(document: Document) {
        val details = FileUtil.getDocumentDetails(context, document.url)
        documentDao.addDocument(
                DocumentEntity(document.url, details.name, details.size, details.thumbnail)
        )

    }

    override suspend fun readAll(): List<Document> = documentDao.getDocuments().map {
        Document(
                it.uri,
                it.title,
                it.size,
                it.thumbnailUri
        )
    }

    override suspend fun remove(document: Document) = documentDao.removeDocument(
            DocumentEntity(document.url, document.name, document.size, document.thumbnail)
    )
}