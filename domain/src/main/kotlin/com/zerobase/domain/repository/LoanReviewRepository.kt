package com.zerobase.domain.repository

import com.zerobase.domain.domain.LoanReview
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface LoanReviewRepository : JpaRepository<LoanReview, Long> {
    fun findByUserKey(userKey: String): LoanReview
}
