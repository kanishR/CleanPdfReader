package com.kanish.android.pdfreader.framework

import com.kash.core.interactor.AddBookMark
import com.kash.core.interactor.AddDocument
import com.kash.core.interactor.*

data class Interactors(val addBookmark: AddBookMark,
                       val getBookmarks: GetBookMarks,
                       val deleteBookmark: RemoveBookMark,
                       val addDocument: AddDocument,
                       val getDocuments: GetDocuments,
                       val removeDocument: RemoveDocument,
                       val getOpenDocument: GetOpenDocuments,
                       val setOpenDocument: SetOpenDocument)