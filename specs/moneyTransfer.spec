Money Transfer Test
=====================
Created by onderyerim on 12.01.2025

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.

|  username  |  password  |
|------------|------------|
|onder.yerim@testinium.com  |  Onder123|


Başka Hesaba Başarılı Para Transferi Yapılır / Case 1
---------
* <username> kullanıcı adı ve <password> şifresi ile login olunur.
* Open Money Transfer butonuna tıklanır.
* Transfer Money butonuna tıklanır.
* Reciever Account seçeneklerinden rasgele bir hesap seçilir.
* "1000" gönderilecek para miktarı girilir.
* Send butonu ile para gönderilir.
* Rastgele seçilen Reciever Account ile paranın gönderildiği hesabın aynı olduğu kontrol edilir.
* "1000" gönderilen paranın doğru olduğu kontrol edilir.

Hesap Bakiyesinin Sıfırın Altına Düşmediği Kontrol Edilir / Case 2
---------
* <username> kullanıcı adı ve <password> şifresi ile login olunur.
* Open Money Transfer butonuna tıklanır.
* Transfer Money butonuna tıklanır.
* "999999999" gönderilecek para miktarı girilir.
* Send butonu ile para gönderilir.
* Hesapta kalan bakiyenin sıfırın altında olmadığı kontrol edilir.