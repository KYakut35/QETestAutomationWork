QE Automation Work
=====================

AC-001 Login Olma Senaryosu - Positive Case
----------------
Tags:Login
* URL linkine gidilir
* Sayfanın açıldığı kontrol edilir
* Login için Username ve Password doğru bir şekilde girilir

AC-002 Login Olma Senaryosu - Negative Case
----------------
Tags:Login
* URL linkine gidilir
* Sayfanın açıldığı kontrol edilir
* Login için Username ve Password yanlış bir şekilde girilir

AC-003 Para Transferi Kontrolü
----------------
Tags:Login,Money Transfer
* Başarılı bir şekilde login olunur
* homeInfoTab elementi sayfada var mı kontrol et
* homeOpenTransfer elementine tıkla
* Transfer Money butonuna tıklanır
* Transfer edilecek Amount girilir ve Send butonuna tıklanır
* İşlem detayı doğrulanır

AC-004 Para Yükleme Kontrolü
----------------
Tags:Login, Deposit
* Başarılı bir şekilde login olunur
* homeInfoTab elementi sayfada var mı kontrol et
* homeOpenTransfer elementine tıkla
* Add Money butonuna tıklanır
* Yıldızlı alanlar doldurulur ve Send butonuna tıklanır
* Yükleme detayı doğrulanır

AC-005 Edit Account Kontrolü
----------------
Tags: Login, Edit Account
* Başarılı bir şekilde login olunur
* homeInfoTab elementi sayfada var mı kontrol et
* homeOpenTransfer elementine tıkla
* Edit Account butonuna tıklanır
* Yeni hesap ismi girilir ve Send butonuna tıklanır
* Hesap ismi değişikliği doğrulanır

AC-006 Logout Kontrolü
----------------
Tags: Login, Edit Account, Logout
* Başarılı bir şekilde login olunur
* homeInfoTab elementi sayfada var mı kontrol et
* homeOpenTransfer elementine tıkla
* Edit Account butonuna tıklanır
* Yeni hesap ismi girilir ve Send butonuna tıklanır
* Hesap ismi değişikliği doğrulanır
* Transfer sayfasından geri butonuna tıklayıp logout olunur
* homeLogoutButton elementine tıkla
