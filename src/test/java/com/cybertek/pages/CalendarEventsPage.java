package com.cybertek.pages;

import com.cybertek.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 public class CalendarEventsPage extends BasePage{

    public CalendarEventsPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "[title='Create Calendar event']")
    public WebElement createCalendarEvent;

    //Finding dote!!!!
    @FindBy(xpath = "//tbody/tr[18]/td[9]")
    public WebElement dote;

    //Finding Grid setting button
    @FindBy(xpath = "//i[@class='fa-cog hide-text']")
    public WebElement gridSettingBtn;




}
