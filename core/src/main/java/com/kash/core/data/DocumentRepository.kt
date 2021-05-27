package com.kash.core.data

import com.kash.core.domain.Document

/**
 * Created by Kanish Roshan on 27/05/21.
 */
class DocumentRepository(
        private val documentDataSource: DocumentDataSource,
        private val openDocumentDataSource: OpenDocumentDataSource) {

    suspend fun addDocument(document: Document) = documentDataSource.add(document)

    suspend fun getDocuments() = documentDataSource.readAll()

    suspend fun removeDocument(document: Document) = documentDataSource.remove(document)

    fun setOpenDocument(document: Document) = openDocumentDataSource.setOpenDocument(document)

    fun getOpenDocument() = openDocumentDataSource.getOpenDocument()
}