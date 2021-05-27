package com.kash.core.interactor

import com.kash.core.data.BookmarkRepository
import com.kash.core.domain.Bookmark
import com.kash.core.domain.Document

/**
 * Created by Kanish Roshan on 27/05/21.
 */
class RemoveBookMark(private val bookmarkRepository: BookmarkRepository) {
    suspend operator fun invoke(document: Document,bookmark: Bookmark)= bookmarkRepository.removeBookmark(document,bookmark)
}