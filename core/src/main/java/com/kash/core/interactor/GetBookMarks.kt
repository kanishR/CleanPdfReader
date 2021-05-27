package com.kash.core.interactor

import com.kash.core.data.BookmarkRepository
import com.kash.core.domain.Document

/**
 * Created by Kanish Roshan on 27/05/21.
 */
class GetBookMarks(private val bookmarkRepository: BookmarkRepository) {
    suspend operator fun invoke(document: Document)=bookmarkRepository.getBookmarks(document)
}