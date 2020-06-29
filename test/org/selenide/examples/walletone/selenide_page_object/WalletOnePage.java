package org.selenide.examples.walletone.selenide_page_object;

import com.codeborne.selenide.Selectors;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.page;

public class WalletOnePage {
    public int searchForJoinButtonWhichNameIs(String text) {
        return $$(By.partialLinkText(text)).size();

    }
}





