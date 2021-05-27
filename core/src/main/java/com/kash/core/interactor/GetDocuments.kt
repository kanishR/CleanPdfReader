package com.kash.core.interactor

import com.kash.core.data.DocumentRepository

/**
 * Created by Kanish Roshan on 27/05/21.
 */
class GetDocuments(private val documentRepository: DocumentRepository) {

    suspend operator fun invoke()=documentRepository.getDocuments()
}