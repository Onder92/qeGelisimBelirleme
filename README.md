# Para Transferi Web Uygulaması

Para Transferi Web Uygulaması, kullanıcıların hesaplar arasında kolay ve güvenli bir şekilde para transferi yapmasını sağlayan bir uygulamadır. Java, Selenium ve Gauge teknolojileri kullanılarak geliştirilmiştir.

## İçindekiler

- [Proje Hakkında](#proje-hakkında)
- [Özellikler](#özellikler)
- [Kurulum](#kurulum)
- [Kullanım](#kullanım)
- [Testlerin Çalıştırılması](#testlerin-çalıştırılması)
- [Test Planları](#test-planları)
- [Katkıda Bulunma](#katkıda-bulunma)
- [Lisans](#lisans)
- [İletişim](#iletişim)

## Proje Hakkında

Para Transferi Web Uygulaması, kullanıcıların:
- Hesaplarına giriş yapmasına,
- Hesap bakiyelerini görüntülemesine,
- Başka bir hesaba para transferi yapmasına,
- Kredi kartı ile para yüklemesine olanak tanır.

Ayrıca uygulama, test süreçlerini otomatikleştirmek için Gauge ve Selenium araçlarını kullanır.

## Özellikler

- **Kullanıcı Girişi:** Güvenli kimlik doğrulama.
- **Para Transferi:** Hesaplar arası hızlı para transferi.
- **Kredi Kartı ile Yükleme:** Hesaplara kredi kartı ile para yükleme.
- **Geçmiş Takibi:** Yapılan işlemlerin kayıt altına alınması.
- **Test Otomasyonu:** Gauge ile kolay test yazma ve raporlama.

## Kurulum

Projenizi yerel ortamda çalıştırmak için aşağıdaki adımları izleyin:

1. **Depoyu klonlayın:**
   ```bash
   git clone https://github.com/Onder92/moneyTransfer-web.git

Proje dizinine gidin:

bash
Copy code
cd moneyTransfer-web
Bağımlılıkları yükleyin: Maven kullanarak proje bağımlılıklarını yükleyin:

bash
Copy code
mvn clean install
Gauge için gerekli plugin'leri yükleyin: Eğer Gauge kurulu değilse veya gerekli plugin'ler eksikse şu komutları çalıştırabilirsiniz:

bash
Copy code
gauge install java
Kullanım
Uygulamayı Çalıştırma
Projenizi başlatmak için şu komutu kullanabilirsiniz:

bash
Copy code
mvn spring-boot:run
Uygulama başarıyla çalıştığında, http://localhost:8080 adresine giderek erişim sağlayabilirsiniz.

Testlerin Çalıştırılması
Gauge kullanarak testleri çalıştırmak için aşağıdaki adımları izleyin:

Tüm test senaryolarını çalıştırmak için:

bash
Copy code
gauge run specs
Belirli bir planı çalıştırmak için:

bash
Copy code
gauge run plans/PlanAdi.plan
HTML Test Raporlarını Görüntüleme: Testler tamamlandıktan sonra raporları şu adreste bulabilirsiniz:

bash
Copy code
reports/html-report/index.html
Test Planları
Bu proje kapsamında aşağıdaki test planları hazırlanmıştır:

AllTests.plan:
Tüm test senaryolarını çalıştıran genel bir test planıdır.

LoginTests.plan:
Kullanıcı girişi senaryolarını içerir.

MoneyTransferTests.plan:
Para transferi işlemleriyle ilgili senaryoları test eder.

NegativeTests.plan:
Negatif senaryoları doğrulamak için kullanılır.

Her planı çalıştırmak için şu komutu kullanabilirsiniz:

bash
Copy code
gauge run plans/[PlanAdi].plan
Katkıda Bulunma
Projeye katkıda bulunmak için aşağıdaki adımları izleyebilirsiniz:

Proje Fork’u Oluşturun
Yeni Bir Branch Açın:
bash
Copy code
git checkout -b yeni-ozellik
Değişikliklerinizi Yapın ve Commit Edin:
bash
Copy code
git commit -m "Yeni özellik eklendi"
Branch’inizi Push Edin:
bash
Copy code
git push origin yeni-ozellik
Pull Request Oluşturun
Lisans
Bu proje MIT Lisansı ile lisanslanmıştır. Daha fazla bilgi için LICENSE dosyasını inceleyebilirsiniz.

İletişim
Bu proje hakkında geri bildirimde bulunmak veya destek almak için aşağıdaki iletişim bilgilerini kullanabilirsiniz:

Proje Sahibi: Onder Yerim
GitHub: MoneyTransfer-Web
E-posta: onder.yerim@testinium.com
