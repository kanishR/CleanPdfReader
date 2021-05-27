package com.kanish.android.pdfreader.framework

import android.content.Context
import com.kanish.android.pdfreader.framework.db.BookmarkEntity
import com.kanish.android.pdfreader.framework.db.MajesticReaderDatabase
import com.kash.core.data.BookMarkDataSource
import com.kash.core.domain.Bookmark
import com.kash.core.domain.Document

/**
 * Created by Kanish Roshan on 27/05/21.
 */
class RoomBookMarkDataSource(context: Context) :BookMarkDataSource{

    private val bookMarkDao=MajesticReaderDatabase.getInstance(context).bookmarkDao()

    override suspend fun add(document: Document, bookmark: Bookmark) =bookMarkDao.addBookmark(BookmarkEntity(documentUri = document.url,page = bookmark.page))


    override suspend fun read(document: Document): List<Bookmark> =bookMarkDao.getBookmarks(documentUri = document.url).map {
        Bookmark(it.id,it.page)
    }


    override suspend fun remove(document: Document, bookmark: Bookmark) =bookMarkDao.removeBookmark( BookmarkEntity(id = bookmark.id, documentUri = document.url, page = bookmark.page))

}