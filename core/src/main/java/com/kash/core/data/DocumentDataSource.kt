package com.kash.core.data

import com.kash.core.domain.Document

/**
 * Created by Kanish Roshan on 27/05/21.
 */
interface DocumentDataSource {
    suspend fun add(document: Document)

    suspend fun readAll(): List<Document>

    suspend fun remove(document: Document)
}