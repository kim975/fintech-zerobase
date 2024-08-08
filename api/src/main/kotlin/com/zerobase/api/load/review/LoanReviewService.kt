package com.zerobase.api.load.review

interface LoanReviewService {
    fun loanReviewMain(userKey: String) : LoanReviewDto.LoanReviewResponseDto

    fun getLoanResult(userKey: String): LoanReviewDto.LoanReview
}