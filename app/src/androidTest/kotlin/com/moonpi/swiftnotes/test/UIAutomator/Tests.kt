package com.moonpi.swiftnotes.test.UIAutomator

import org.junit.Test


class Tests : BaseRunner(){


@Test
fun testOne(){
    mainPage.checkMainPage()
    mainPage.emptyPageSign()
    mainPage.checkAddButton()
    mainPage.pressAddButton()
    addNotePage.titleAvailable()
    addNotePage.noteAvailable()
    addNotePage.goToMain()
    addNotePage.saveChangesAvailable()
    addNotePage.yesNoAvailable()
    addNotePage.pressNo()
    mainPage.checkMainPage()
    }

@Test
fun testTwo(){
    mainPage.pressAddButton()
    addNotePage.setNote("Заметка 1", "Тестовая запись 1")
    addNotePage.checkNote("Заметка 1", "Тестовая запись 1")
    addNotePage.goToMain()
    addNotePage.pressYes()
    mainPage.checkNotes("Заметка 1")
}

@Test
fun testThree(){
    mainPage.clickSettings()
    mainPage.checkSettings()
    mDevice.pressBack()
    mainPage.pressAddButton()
    addNotePage.clickSettings()
    addNotePage.checkSettings()
}
}