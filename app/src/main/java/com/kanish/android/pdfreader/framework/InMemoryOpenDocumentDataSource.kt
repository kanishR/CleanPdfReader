package com.kanish.android.pdfreader.framework

import com.kash.core.data.OpenDocumentDataSource
import com.kash.core.domain.Document

/**
 * Created by Kanish Roshan on 27/05/21.
 */
class InMemoryOpenDocumentDataSource :OpenDocumentDataSource {

    private var openDocument: Document = Document.EMPTY

    override fun setOpenDocument(document: Document) {
    openDocument=document
    }

    override fun getOpenDocument(): Document =openDocument
}