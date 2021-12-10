## REST ASSURED STEAM API TEST

https://steamcommunity.com/dev/apikey adresinden API_KEY'i alabiliriz.

# pom.xml dosyası

![image](https://user-images.githubusercontent.com/27950192/145586609-23232fc4-eed7-4a4e-90d8-d5f9561e923d.png)

# RestAssuredSteam sınıfı
### checkNews
RestAssuredSteam.java dosyasını oluşturduktan sonra API_KEY, BASE_URL ve STEAM_ID'mizi tanımladık.(Steam ID'nizi bilmiyorsanız -> https://steamid.xyz/) Sonrasında checkNews adlı test fonksiyonunu tanımladık. Request parametresi olarak appid ve count gerekliydi, appidlere -> https://steamdb.info/ sitesinden eriştim, count ise ilgili uygulama ile alakalı kaç tane haber göstermesi. Girdiğim appid'si NBA 2K22'ye ait ve onla ilgili haberler mi döndürüyor kontrolünü sağlıyoruz.
![image](https://user-images.githubusercontent.com/27950192/145586739-cf45f7b1-4730-4885-a47d-c1c9089e0b57.png)

### checkNumberOfPlayers
Bu test fonksiyonunda ise bize oyunu oynayan oyuncu sayısını döndürüyor. Bu sayı 4000'nin üstünde mi kontrolü yapıyorum. Ve parametre olarak appid alıyor onu da SKYRIM'in id'sini kullandım.

### checkUserHasGame 
STEAM_ID'si gönderilen kullanıcının appid'si girilen uygulamaya sahip mi kontrolü yapılıyor. Sahipse true döndürüyor. Bu request için API_KEY gereklidir.


### friendsCheck 
STEAM_ID'si gönderilen kullanıcının arkadaş listesi döndürülüyor. API KEY gerekli.

![image](https://user-images.githubusercontent.com/27950192/145587523-f152cb4d-92db-4c10-abb1-83ea97845a88.png)
