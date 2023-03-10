package hp.hb.client;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

import static hp.hb.client.view.Display.*;

public class Gameplay {

    public void tick() {
        // aktualizacaj stanu i logiki wynikajacej z uplywajacego czasu
    }

    public void render(Graphics graphics) {
        // prezentacja

        try { //todo wywalić stąd wczytywanie pliku
            graphics.drawImage(ImageIO.read(Gameplay.class.getResource("/boardMini.jpg")),getWidth(0.3), getHeight(0.1), getWidth(0.6),getHeight(0.8),null );
        } catch (IOException e) {
            e.printStackTrace();
        }

        //pole gracza
        graphics.drawRect( getWidth(0.035), getHeight(0.1), getWidth(0.25),getHeight(0.8));
        // dolny
        graphics.setColor(Color.PINK);
        graphics.drawOval(getWidth(0.045), getHeight(0.8), getWidth(0.015),getHeight(0.035));
        graphics.drawString("10", getWidth(0.048), getHeight(0.85));  // do kazdego kolka w roznych kolorach
        //srodkowy
        graphics.setColor(Color.RED);
        graphics.drawOval(getWidth(0.045), getHeight(0.7), getWidth(0.015),getHeight(0.035));
        graphics.drawString("9", getWidth(0.049), getHeight(0.75));  // do kazdego kolka w roznych kolorach
        //gorny
        graphics.setColor(Color.BLACK);
        graphics.drawOval(getWidth(0.045), getHeight(0.6), getWidth(0.015),getHeight(0.035));
        graphics.drawString("8", getWidth(0.049), getHeight(0.65));  // do kazdego kolka w roznych kolorach
        //stos zagranych
        graphics.drawRect( getWidth(0.15), getHeight(0.65), getWidth(0.11),getHeight(0.15));
        // TODO wykonczyc cyfry  OK
        // TODO w gornej czasci dwa rzedy po trzy karty (format oryginalny)
        // karty gracza I linia
        graphics.drawRect( getWidth(0.044), getHeight(0.11), getWidth(0.05),getHeight(0.15));
        graphics.drawRect( getWidth(0.12), getHeight(0.11), getWidth(0.05),getHeight(0.15));
        graphics.drawRect( getWidth(0.19), getHeight(0.11), getWidth(0.05),getHeight(0.15));
        // karty gracza II linia
        graphics.drawRect( getWidth(0.044), getHeight(0.29), getWidth(0.05),getHeight(0.15));
        graphics.drawRect( getWidth(0.12), getHeight(0.29), getWidth(0.05),getHeight(0.15));
        graphics.drawRect( getWidth(0.19), getHeight(0.29), getWidth(0.05),getHeight(0.15));

        // TODO obrocic stos o 90 stopni  OK
        // TODO kwadrat przeciwnika plus kwadrat piorunow
        // kwadrat przeciwnika
        graphics.fillRect( getWidth(0.3), getHeight(0.45), getWidth(0.11),getHeight(0.15));
        graphics.drawRect( getWidth(0.3), getHeight(0.45), getWidth(0.11),getHeight(0.15));
        // TODO przycisk zakonczenia tury (w poblizu kart)
        // przycisk END
        graphics.setColor(Color.BLACK);
        graphics.fillOval(getWidth(0.26), getHeight(0.11), getWidth(0.015),getHeight(0.035));

        // TODO wyswietlic karty za pomoca petli


        //graphics.setColor(Color.YELLOW);
        //graphics.fillOval(position,100, 150,150);

    }

}
// Wyswietlic plansze *
// Flow gry (dostaje kary, zagrywam karty, przycisk do zakonczenia tury .... )
// Wyswietlic gracza
// Na planszy : Wyswietlic prostokaty w miejscach gdzie beda grane elementy (przeciwnki, serca, talia nowych, talia granych )
// Podmiana na grafiki
// Gracz ma 5 kart na start (5 kart dajacych jedna monete i 5 dajacych blyskawice) i zycie na 10. Jak spadnie do zera to przegrywa (uproszczona zasada)
// Jeden przeciwnik (zabiera jedno serce co ture). Brak nagrody za pokonanie.
// 1. Dobranie 5 katr tylko jak jest to pierwsza tura w grze
// 2. Odpala sie wydarzenie (nie w prototypie)
// 3. Efekt przeciwnikow (w prototypie -1 zycie)
// 4a. Zagrywanie kart -- tura gracza --
// 4b. Wykozystanie blyskawic  -- tura gracza
// 4c. Zakup kart (nie w prototypie) -- tura gracza
// 4d. Zakoncz ture
// 5. dobranamy 5 kart
// 6. Zaczyna nastepny gracz (w prototypie gra ta sama osoba)


// Plan pracy nad prototypem
// 1. Wyswietlamy prostokaty
// 2. uproszczony opis
// 3. Zarys przebiegu rozgrywki
// 3a. Pojawia sie 5 kart (wyskakuje opienko i mowi ze mam 5 kart)
// 3b. Wyskakuje okienko przeciwnicy atakuja
// 3c. Wysk. ok.zaczynasz ture
// .............dzialania gracza..................
// 3d. Nic sie nie dzieje dopuki nie zdecydujesz zakoncz ture
// 4. Faktycznie pojawia sie 5 kart wobszarze karty na rece
// 5. Faktycznie przeciwnik wykonuje swoaja akcje co daje efekt zmniejszenia zycia. Uwaga charakterystyka konkretnego przeciwnika. Mozliwosc zamiany
//    Jesli zycie spadlo do 0 - przegrana gry
// 6. Umozliwic klikniecie karty z reki co przeniesie ja do puli aktywnych kart
// 7. Akcja zagranej karty (dodanie byskawicy albo dodanie monety)
// 8. Wybieranie dowolnej ilosci blyskawic i polozenie ich na karcie przeciwnika
//    Jesli ilosc bylskawic przekracza zycie przeciwnika - wygrana gry
// 9. Zaktualizowanie jego stanu
// 10. Zakonczenie tury powoduje prueniesienie wszystkich kart na stos odrzuconych i wyzerowanie niewykozystanych monet i blyskawic
// 11. Dobranie kolejnych 5 kart
// 12. JElsi brakuje kart do dobrania, powrot wszystkich, tasowanie.
// 13. Powrot do punktu 5 (przeciwniycy atakuja )