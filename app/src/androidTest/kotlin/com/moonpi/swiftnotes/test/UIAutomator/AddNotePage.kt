package com.moonpi.swiftnotes.test.UIAutomator

import android.support.test.InstrumentationRegistry
import android.support.test.uiautomator.UiDevice
import android.support.test.uiautomator.UiSelector

class AddNotePage (val mDevice: UiDevice){
    val settings = mDevice.findObject(UiSelector().descriptionContains("More options"))
fun titleAvailable(){
    mDevice.findObject(UiSelector().text("Title")).isEnabled
}
fun noteAvailable(){
    mDevice.findObject(UiSelector().text("Note")).isEnabled
}
fun saveChangesAvailable(){
    mDevice.findObject(UiSelector().textContains("Save changes?")).isEnabled
}
fun yesNoAvailable(){
    mDevice.findObject(UiSelector().textContains("NO")).isEnabled
    mDevice.findObject(UiSelector().textContains("YES")).isEnabled
}
fun pressNo(){
    mDevice.findObject(UiSelector().textContains("NO")).click()
}
fun pressYes(){
    mDevice.findObject(UiSelector().textContains("YES")).click()
}
fun goToMain(){
    mDevice.pressBack()
    mDevice.pressBack()
}
fun clickSettings(){
    settings.click()
}
fun checkSettings(){
    mDevice.findObject(UiSelector().textContains("Note font size")).isEnabled
    mDevice.findObject(UiSelector().textContains("Hide note body in list")).isEnabled
}
fun setNote(title: String, note: String){
    mDevice.findObject(UiSelector().text("Title")).setText(title)
    mDevice.findObject(UiSelector().text("Note")).setText(note)
}

fun checkNote(title: String, note: String){
    mDevice.findObject(UiSelector().text(title)).isEnabled
    mDevice.findObject(UiSelector().text(note)).isEnabled
}
}