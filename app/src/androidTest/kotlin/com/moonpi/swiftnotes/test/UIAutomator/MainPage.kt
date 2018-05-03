package com.moonpi.swiftnotes.test.UIAutomator

import android.support.test.InstrumentationRegistry
import android.support.test.uiautomator.UiDevice
import android.support.test.uiautomator.UiSelector

class MainPage (val mDevice: UiDevice){
    val btnNewNote = mDevice.findObject(UiSelector().descriptionContains("New note"))
    val settings = mDevice.findObject(UiSelector().descriptionContains("More options"))
fun pressAddButton(){
    btnNewNote.click()
}
fun emptyPageSign() {
    mDevice.findObject(UiSelector().text("Press '+' to add new note")).isEnabled
}
fun checkAddButton(){
    btnNewNote.isEnabled
}
fun clickSettings(){
    settings.click()
}
fun checkSettings(){
    mDevice.findObject(UiSelector().textContains("Backup notes")).isEnabled
    mDevice.findObject(UiSelector().textContains("Restore notes")).isEnabled
    mDevice.findObject(UiSelector().textContains("Rate app")).isEnabled
}
fun checkNotes(a: String){
    mDevice.findObject(UiSelector().text(a)).isEnabled
}
fun checkMainPage(){
    mDevice.findObject(UiSelector().text("Swiftnotes")).isEnabled
}
}