Money Transfer
=====================
Created by onderyerim on 11.01.2025

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.

|  username  |  password  |
|------------|------------|
|onder.yerim@testinium.com  |  Onder123|


Login Olunduğu Kontrol Edilir / Case 1
--------
* <username> kullanıcı adı ve <password> şifresi ile login olunur.
* Ana sayfadaki tablonun elementleri kontrol edilir.


Ana Sayfadaki Elementlerin Kontrolü Yapılır / Case 2
---------
* <username> kullanıcı adı ve <password> şifresi ile login olunur.
* Ana sayfadaki tablonun elementleri kontrol edilir.
* Ana sayfadaki Open Money Transfer butonu görünür olduğu kontrol edilir.


Hesaba Kredi Kartı ile Para Yüklenir ve Doğru Miktarın Hesaba Yüklendiği Kontrol Edilir / Case 3
--------
* <username> kullanıcı adı ve <password> şifresi ile login olunur.
* Open Money Transfer butonuna tıklanır.
* Add Money butonuna tıklanır.
* Hesaba, "1234 1234 1234 1234" kredi kartı numarası, "Önder" isim, "1026" son kullanma tarihi ve "110" kodu ile "1000" para yatırılır.
* Son yatırılan miktarın, hesaba yatan para "1000" ile aynı olduğu kontrol edilir.

Hesap Adı Başarılı Şekilde Güncellenir / Case 4
--------
* <username> kullanıcı adı ve <password> şifresi ile login olunur.
* Open Money Transfer butonuna tıklanır.
* Edit Account butonuna tıklanır.
* Account name text alanı temizlenir.
* Hesap adı "onder.yeni" olarak güncellenir.
* Doğru şekilde güncellendiği kontrol edilir.

Hesap Adı Boş Şekilde Güncellennmeye Çalışılır / Negatif Case / Case 5
-------
* <username> kullanıcı adı ve <password> şifresi ile login olunur.
* Open Money Transfer butonuna tıklanır.
* Edit Account butonuna tıklanır.
* Account name text alanı temizlenir.

Başka Hesaba Başarılı Para Transferi Yapılır / Case 6
---------
* <username> kullanıcı adı ve <password> şifresi ile login olunur.
* Open Money Transfer butonuna tıklanır.
* Transfer Money butonuna tıklanır.
* Reciever Account seçeneklerinden rasgele bir hesap seçilir.
* "1000" gönderilecek para miktarı girilir.
* Send butonu ile para gönderilir.
* Rastgele seçilen Reciever Account ile paranın gönderildiği hesabın aynı olduğu kontrol edilir.
* "1000" gönderilen paranın doğru olduğu kontrol edilir.