package com.kash.core.data

import com.kash.core.domain.Bookmark
import com.kash.core.domain.Document

/**
 * Created by Kanish Roshan on 27/05/21.
 */
class BookmarkRepository(private val dataSource: BookMarkDataSource) {

    suspend fun addBookmark(document: Document, bookmark: Bookmark) =
            dataSource.add(document, bookmark)

    suspend fun getBookmarks(document: Document) = dataSource.read(document)

    suspend fun removeBookmark(document: Document, bookmark: Bookmark) =
            dataSource.remove(document, bookmark)
}