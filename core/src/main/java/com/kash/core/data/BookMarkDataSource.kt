package com.kash.core.data

import com.kash.core.domain.Bookmark
import com.kash.core.domain.Document

/**
 * Created by Kanish Roshan on 27/05/21.
 */
interface BookMarkDataSource {
    suspend fun add(document: Document,bookmark: Bookmark)
    suspend fun read(document: Document):List<Bookmark>
    suspend fun remove(document: Document, bookmark: Bookmark)
}