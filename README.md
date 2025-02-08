# 🚀 Selenium + Gauge Test Otomasyonu

Bu proje, **Gauge** test otomasyon framework'ü kullanılarak **Selenium 4** ile web uygulamalarını test etmek için oluşturulmuştur.  
Testler **Chrome, Firefox ve Edge** tarayıcılarında çalıştırılabilir ve **Extent Reports** ile detaylı raporlar oluşturur.

---

## 📌 Proje Yapısı
```plaintext
📂 altYapiSeleniumGauge
 ├── 📂 src
 │   ├── 📂 test
 │   │   ├── 📂 java/altYapi/seleniumGauge/step  # Gauge step implementation'ları
 │   │   ├── 📂 java/altYapi/seleniumGauge/driver  # WebDriver yönetimi
 │   │   ├── 📂 java/altYapi/seleniumGauge/reports # Extent Reports entegrasyonu
 │   │   ├── 📂 java/altYapi/seleniumGauge/utils   # Yardımcı metodlar (JsonUtils, Logger vb.)
 │   ├── 📂 specs  # Gauge test senaryoları (Markdown formatında)
 │
 ├── pom.xml  # Maven bağımlılıkları ve derleme ayarları
 ├── README.md  # Proje dokümantasyonu
 ├── .gitignore  # Git için gereksiz dosyaları hariç tutar
 ├── gauge.properties  # Gauge framework ayarları
 ```


---

## 🛠 **Kurulum & Çalıştırma**

### **1️⃣ Gerekli Bağımlılıkları Kur**
Projenin çalışabilmesi için aşağıdaki bileşenlerin sisteminizde kurulu olması gerekir:

✅ **Java 23**  
✅ **Maven** (En az 3.8.0)  
✅ **Gauge** (En az 1.4.3)  
✅ **Google Chrome, Firefox ve Edge tarayıcıları**

**Kurulu olup olmadığını kontrol etmek için:**
```sh
java -version
mvn -version
gauge -v
```
### **2️⃣ Projeyi Klonlayın**
```sh
git clone https://github.com/Onder92/qeGelisimBelirleme
cd altYapiSeleniumGauge
```
### **3️⃣ Bağımlılıkları Yükleyin**
```sh
mvn clean install
```
### **4️⃣ Testleri Çalıştırın**
Tüm testleri çalıştırmak için:

```sh
mvn gauge:execute
```
Belirli bir senaryoyu çalıştırmak için:

```sh
gauge run specs/transferMoney.spec
```
Belirli bir tarayıcıda çalıştırmak için:

```sh
mvn gauge:execute -Denv=chrome
mvn gauge:execute -Denv=firefox
mvn gauge:execute -Denv=edge
```
## 📌 Test Senaryoları
Bu proje aşağıdaki test senaryolarını içermektedir:
```sh
🔹 Case 1: Login Olunduğu Kontrol Edilir
<username> ve <password> kullanarak giriş yapılır.
Ana sayfadaki tablo elementleri kontrol edilir.

🔹 Case 2: Ana Sayfa Elementleri Kontrol Edilir
<username> ve <password> kullanarak giriş yapılır.
Ana sayfadaki tablo elementleri kontrol edilir.
"Open Money Transfer" butonunun görünür olduğu kontrol edilir.

🔹 Case 3: Hesaba Kredi Kartı ile Para Yükleme
Kullanıcı giriş yapar.
"Open Money Transfer" butonuna tıklanır.
"Add Money" butonuna tıklanır.
Kredi kartı bilgileri girilerek 1000 birim para yüklenir.
Hesaba yüklenen para miktarı kontrol edilir.

🔹 Case 4: Hesap Adı Güncelleme
Kullanıcı giriş yapar.
"Open Money Transfer" butonuna tıklanır.
"Edit Account" butonuna tıklanır.
Hesap adı "onder.yeni" olarak değiştirilir.
Güncelleme işlemi başarılı olup olmadığı kontrol edilir.

🔹 Case 5: Boş Hesap Adı Güncellenmeye Çalışılır (Negatif Test)
Kullanıcı giriş yapar.
"Open Money Transfer" butonuna tıklanır.
"Edit Account" butonuna tıklanır.
Hesap adı boş bırakılarak güncellenmeye çalışılır.
"Update" butonunun pasif olduğu kontrol edilir.

🔹 Case 6: Başka Hesaba Para Transferi
Kullanıcı giriş yapar.
"Open Money Transfer" butonuna tıklanır.
"Transfer Money" butonuna tıklanır.
Rastgele bir hesap seçilir ve 1000 birim para gönderilir.
Gönderilen hesabın ve miktarın doğruluğu kontrol edilir.

🔹 Case 7: Hesap Bakiyesinin Sıfırın Altına Düşmediği Kontrolü
Kullanıcı giriş yapar.
"Open Money Transfer" butonuna tıklanır.
"Transfer Money" butonuna tıklanır.
999999999 birim para gönderilmeye çalışılır.
Hesapta kalan bakiyenin 0'ın altına inmediği kontrol edilir.
```