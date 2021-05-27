package com.kash.core.data

import com.kash.core.domain.Document

/**
 * Created by Kanish Roshan on 27/05/21.
 */
interface OpenDocumentDataSource {
    fun setOpenDocument(document: Document)

    fun getOpenDocument(): Document
}