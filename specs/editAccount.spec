Edit Account Test
=====================
Created by onderyerim on 12.01.2025

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.
          
|  username  |  password  |
|------------|------------|
|onder.yerim@testinium.com  |  Onder123|


Hesap Adı Başarılı Şekilde Güncellenir / Case 1
--------
* <username> kullanıcı adı ve <password> şifresi ile login olunur.
* Open Money Transfer butonuna tıklanır.
* Edit Account butonuna tıklanır.
* Account name text alanı temizlenir.
* Hesap adı "onder.yeni" olarak güncellenir.
* Doğru şekilde güncellendiği kontrol edilir.

Hesap Adı Boş Şekilde Güncellennmeye Çalışılır / Negatif Case / Case 2
-------
* <username> kullanıcı adı ve <password> şifresi ile login olunur.
* Open Money Transfer butonuna tıklanır.
* Edit Account butonuna tıklanır.
* Account name text alanı temizlenir.
* Update butonunun pasif olduğu kontrol edilir.