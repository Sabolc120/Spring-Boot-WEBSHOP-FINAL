A PROJEKT FORRÁSA MEGTALÁLHATÓ A MESTER ÁGON!

HASZNÁLATI ÚTMUTATÓ
1. Szükséges adatbázis: MySql
2. ADATBÁZISHOZ CSATLAKOZÁS MENETE:
  spring.jpa.hibernate.ddl-auto=update
  spring.datasource.url=jdbc:mysql://localhost:3306/Adatbázisodneve?useSSL=false
  spring.datasource.username=root
  spring.datasource.password=
  spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
  spring.jpa.show-sql=true
 ------'Adatbázisneved' saját adatbázisa.
3. Szükségesek: Java, JDK, Maven, MySql.

SPECIFIKÁCIÓK:
1. Termék tulajdonságok megjelenítése egyenesen adatbázisból
2. Regisztráció validáció (Legyen egy szám..nagy betű...)
3. Bejelentkezés validáció
4. Komment szekció minden eggyes termékhez
5. Kosár funkció, a termékeket kosárba lehet helyezni.
6. A kosárból a termékeket ki is lehet törölni.

SZERZŐI MEGJEGYZÉS:
A projekt kizárólag gyakorlás képen készült el, mint önéletrajz tartalom és jövőbeli portfolió tartalom.
A weboldalon felhasznált képek nincsenek a tulajdonomban, és a weboldal sosem fog kikerülni a nyilvános webre.
A weboldalon felhasznált adatok nem valódiak, megtévesztésképen sosem fog kikerülni a nyilvános webre.
-A projekt egy üres adatbázissal nem egészen fog működni és hiányok fognak fellépni mivel a termék adatok onnan vannak lekérdezve, ajánlott letőlteni a mellékelt adatbázist.
