Specification Heading
=====================
Created by testinium on 1.08.2021

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.

Teste Hazırlık Sepetteki Ürünleri Boşaltma / Test Case 0
----------------
* Otomasyon ortamı otomatik olarak ayarlanır.
* "" kullanıcı adı ve "Test123123" şifresi ile üyelik girişi yapılır.
* -STAGE- Sepetteki tüm ürün/ürünler silinir.

Üye Girişi Sonrası Random Ürün Seçerek Sipariş Verme / Adrese Teslimat / Kredi Kartı / Case 1
------------
* Otomasyon ortamı otomatik olarak ayarlanır.
* "" kullanıcı adı ve "Test123123" şifresi ile üyelik girişi yapılır.
//* Searchbox'ta arama yapılır.
* -STAGE- search kullanımı
* Listelenen ürünlerin random olarak sıralanması sağlanır.
* Listelenen ürünlerden bir tanesi random olarak seçilir.
* Random olarak renk seçimi yapılır.
* Seçilen ürünün random olarak beden seçimi yapılır.
* Seçilen ürün favorilere eklenir.
* Seçilen ürün sepete eklenir.
* Sepete eklenen ürün ile açılan popuptan sepete gidilir.
* Sepette fazladan ürün varsa silinir.
* Ürün adedi random olarak seçilir.
* Ürün adedi kapıda ödeme için 1'e indirilir.
* Sepet onaylanır.
* Üye girişi sonrası adrese teslimat için yeni adres eklenir.
* Ödeme adımına geçilir.
* Kredi kartı ile ödeme işlemi gerçekleştirilir ve sipariş tamamlanır.
//* -STAGE- Kredi kartı ile ödeme işlemi gerçekleştirilir ve sipariş tamamlanır.
//* -STAGE- "283126" ile 3D Ekranı onaylanır ve sipariş tamamlanır.
//* -STAGE- Success ekranı kontrol edilir.
* -STAGE- Sepetteki tüm ürün/ürünler silinir.
* Favorilere eklenen ürün/ürünler, hesabım sayfasında favorilerden çıkartılır.


Üye Oluşturma Sonrası Random Ürün Seçerek Sipariş Verme / Adrese Teslimat / Kredi Kartı / Case 2
---------------
* Otomasyon ortamı otomatik olarak ayarlanır.
* "" kullanıcı adı ve "Test123." şifresi ile üyelik oluşturma işlemi gerçekleştirilir.
//* Searchbox'ta arama yapılır.
* -STAGE- search kullanımı
* Listelenen ürünlerin random olarak sıralanması sağlanır.
* Listelenen ürünlerden bir tanesi random olarak seçilir.
* Random olarak renk seçimi yapılır.
* Seçilen ürünün random olarak beden seçimi yapılır.
* Seçilen ürün favorilere eklenir.
* Favorilere eklenen ürün, ürün detayda favorilerden çıkartılır.
* Seçilen ürün sepete eklenir.
* Sepete eklenen ürün ile açılan popuptan sepete gidilir.
* Sepette fazladan ürün varsa silinir.
* Ürün adedi random olarak seçilir.
* Ürün adedi kapıda ödeme için 1'e indirilir.
* Sepet onaylanır.
* Üyelik oluşturma sonrası adrese teslimat için adres bilgisi eklenir.
* Ödeme adımına geçilir.
* Kredi kartı ile ödeme işlemi gerçekleştirilir ve sipariş tamamlanır.

Sepet Onaylama Sonrası Üye Girişi ile Sipariş Tamamlama / Adrese Teslimat / Kredi Kartı / Case 3
-------------
* Otomasyon ortamı otomatik olarak ayarlanır.
//* Searchbox'ta arama yapılır.
* -STAGE- search kullanımı
* Listelenen ürünlerin random olarak sıralanması sağlanır.
* Listelenen ürünlerden bir tanesi random olarak seçilir.
* Random olarak renk seçimi yapılır.
* Seçilen ürünün random olarak beden seçimi yapılır.
* Seçilen ürün sepete eklenir.
* Sepete eklenen ürün ile açılan popuptan sepete gidilir.
* Sepette fazladan ürün varsa silinir.
* Ürün adedi random olarak seçilir.
* Ürün adedi kapıda ödeme için 1'e indirilir.
* Sepet onaylanır.
* Sepet onaylama sonrası "elyaseotomasyon@gmail.com" kullanıcı adı ve "Test123123" şifresi ile üyelik girişi yapılır.
* Sepet onaylanır.
* Üye girişi sonrası adrese teslimat için yeni adres eklenir.
* Ödeme adımına geçilir.
* Kredi kartı ile ödeme işlemi gerçekleştirilir ve sipariş tamamlanır.
* -STAGE- Sepetteki tüm ürün/ürünler silinir.

Sepet Onaylama Sonrası Üyelik Oluşturarak Sipariş Tamamlama / Adrese Teslimat / Kredi Kartı / Case 4
-----------------
* Otomasyon ortamı otomatik olarak ayarlanır.
//* Searchbox'ta arama yapılır.
* -STAGE- search kullanımı
* Listelenen ürünlerin random olarak sıralanması sağlanır.
* Listelenen ürünlerden bir tanesi random olarak seçilir.
* Random olarak renk seçimi yapılır.
* Seçilen ürünün random olarak beden seçimi yapılır.
* Seçilen ürün sepete eklenir.
* Sepete eklenen ürün ile açılan popuptan sepete gidilir.
* Sepette fazladan ürün varsa silinir.
* Ürün adedi random olarak seçilir.
* Ürün adedi kapıda ödeme için 1'e indirilir.
* Sepet onaylanır.
* Sepet onaylama sonrası "" kullanıcı adı ve "Test123." şifresi ile üyelik oluşturma işlemi gerçekleştirilir.
* Sepet onaylanır.
* Üyelik oluşturma sonrası adrese teslimat için adres bilgisi eklenir.
* Ödeme adımına geçilir.
* Kredi kartı ile ödeme işlemi gerçekleştirilir ve sipariş tamamlanır.

Sepet Onay Sonrası Üye Olmadan Devam Ederek Sipariş Tamamlama / Adrese Teslimat / Kredi Kartı / Case 5
----------------
* Otomasyon ortamı otomatik olarak ayarlanır.
//* Searchbox'ta arama yapılır.
* -STAGE- search kullanımı
* Listelenen ürünlerin random olarak sıralanması sağlanır.
* Listelenen ürünlerden bir tanesi random olarak seçilir.
* Random olarak renk seçimi yapılır.
* Seçilen ürünün random olarak beden seçimi yapılır.
* Seçilen ürün sepete eklenir.
* Sepete eklenen ürün ile açılan popuptan sepete gidilir.
* Sepette fazladan ürün varsa silinir.
* Ürün adedi random olarak seçilir.
* Ürün adedi kapıda ödeme için 1'e indirilir.
* Sepet onaylanır.
* Sepet onaylama sonrası üye olmadan devam edilir.
* Sepet onaylanır.
* Üye olmadan devam ederek adrese teslimat için adres bilgisi eklenir.
* Ödeme adımına geçilir.
* Kredi kartı ile ödeme işlemi gerçekleştirilir ve sipariş tamamlanır.

Favorilere Ekleme Sonrası Üye Girişi ile Sipariş Tamamlama / Adrese Teslimat / Kredi Kartı / Case 6
------------------
* Otomasyon ortamı otomatik olarak ayarlanır.
//* Searchbox'ta arama yapılır.
* -STAGE- search kullanımı
* Listelenen ürünlerin random olarak sıralanması sağlanır.
* Listelenen ürünlerden bir tanesi random olarak seçilir.
* Random olarak renk seçimi yapılır.
* Seçilen ürünün random olarak beden seçimi yapılır.
* Seçilen ürün sepete eklenir.
* Sepete eklenen ürün ile açılan pop-up kapatılır.
* Seçilen ürün favorilere eklenir.
* Favorilere ekleme sonrası "elyaseotomasyon@gmail.com" kullanıcı adı ve "Test123123" şifresi ile üyelik girişi yapılır.
* Seçilen ürün favorilere eklenir.
* Sepetim butonuna tıklanır.
* Mini sepete tıklama sonrası açılan pop-uptan sepete gidilir.
* Sepette fazladan ürün varsa silinir.
* Ürün adedi random olarak seçilir.
* Ürün adedi kapıda ödeme için 1'e indirilir.
* Sepet onaylanır.
* Üye girişi sonrası adrese teslimat için yeni adres eklenir.
* Ödeme adımına geçilir.
* Kredi kartı ile ödeme işlemi gerçekleştirilir ve sipariş tamamlanır.
* -STAGE- Sepetteki tüm ürün/ürünler silinir.
* Favorilere eklenen ürün/ürünler, hesabım sayfasında favorilerden çıkartılır.

Favorilere Ekleme Sonrası Üyelik Oluşturarak Sipariş Tamamlama / Adrese Teslimat / Kredi Kartı / Case 7
--------------
* Otomasyon ortamı otomatik olarak ayarlanır.
//* Searchbox'ta arama yapılır.
* -STAGE- search kullanımı
* Listelenen ürünlerin random olarak sıralanması sağlanır.
* Listelenen ürünlerden bir tanesi random olarak seçilir.
* Random olarak renk seçimi yapılır.
* Seçilen ürünün random olarak beden seçimi yapılır.
* Seçilen ürün sepete eklenir.
* Sepete eklenen ürün ile açılan pop-up kapatılır.
* Seçilen ürün favorilere eklenir.
* Favorilere ekleme sonrası "" kullanıcı adı ve "Test123123" şifresi ile üyelik oluşturma işlemi gerçekleştirilir.
* Sepetim butonuna tıklanır.
* Mini sepete tıklama sonrası açılan pop-uptan sepete gidilir.
* Sepette fazladan ürün varsa silinir.
* Ürün adedi random olarak seçilir.
* Ürün adedi kapıda ödeme için 1'e indirilir.
* Sepet onaylanır.
* Üyelik oluşturma sonrası adrese teslimat için adres bilgisi eklenir.
* Ödeme adımına geçilir.
* -STAGE- Kredi kartı ile ödeme işlemi gerçekleştirilir ve sipariş tamamlanır.

