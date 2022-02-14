package com.conamobile.pdpgridview.model

import android.content.Context

class Member(var profile:Int, var fullname:String) {

    override fun toString(): String {
        return "$profile : $fullname"
    }
}