package org.selenide.examples.walletone.selenide_page_object;

import com.codeborne.selenide.junit.TextReport;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class WalletOneTest {

  @Rule
  public TestRule report = new TextReport().onFailedTest(true).onSucceededTest(true);

  @Test
  public void userCanSearch() {
    open("https://yandex.ru/");
    new YandexPage().searchFor("единая касса");

    SearchResultsPage results = new SearchResultsPage();
    results.getResults().shouldHave(sizeGreaterThan(1));
    results.getResult(0).shouldHave(text("Платежный сервис для сайта"));
    sleep(5000);
    $(By.partialLinkText("Платежный сервис для сайта")).click();
    switchTo().window(1);
    sleep(5000);
    int CountOfBlocks;
    CountOfBlocks = new WalletOnePage().searchForJoinButtonWhichNameIs("ПРИСОЕДИНИТЬСЯ");
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("Count of blocks which name is JOIN:"+CountOfBlocks);

  }
}
