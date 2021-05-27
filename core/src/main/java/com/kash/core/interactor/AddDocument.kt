package com.kash.core.interactor

import com.kash.core.data.DocumentRepository
import com.kash.core.domain.Document

/**
 * Created by Kanish Roshan on 27/05/21.
 */
class AddDocument(private val documentRepository: DocumentRepository) {
    suspend operator fun  invoke(document: Document) =documentRepository.addDocument(document)
}