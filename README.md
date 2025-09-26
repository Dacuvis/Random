<img width="1700" height="460" alt="github-header-banner" src="https://github.com/user-attachments/assets/5699ae0a-f24e-44e3-a197-a14f43555f1e" />

<br>
<br>

<div align="left" style="margin-top:40px">
    <a href="URL_PROFIL_INSTAGRAM_ANDA">
        <img src="https://img.shields.io/badge/Instagram-E4405F?style=for-the-badge&logo=instagram&logoColor=white" />
    </a>

    <a href="URL_PROFIL_FACEBOOK_ANDA">
        <img src="https://img.shields.io/badge/Facebook-1877F2?style=for-the-badge&logo=facebook&logoColor=white" />
    </a>

    <a href="URL_PROFIL_TIKTOK_ANDA">
        <img src="https://img.shields.io/badge/TikTok-000000?style=for-the-badge&logo=tiktok&logoColor=white" />
    </a>
</div>
-----

# Item Gacha Sederhana dalam Java

Program Java ini (`Random.java`) adalah simulasi dasar sistem **Gacha**, di mana item didapatkan secara acak berdasarkan probabilitas (chance) yang telah ditentukan. Simulasi ini berjalan sebanyak **10 kali** penarikan.

-----

## Kode Program

```java
public class Random {
    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();

        for (int i = 0; i < 10;i++){
            int chance = random.nextInt(100) + 1;
            String item;

            if (chance <= 40){
                item = "Pedang";
            } else if (chance <= 50) {
                item = "Shovel";
            }else {
                item = "Potion";
            }

            System.out.println("Item yang di dapatkan: " + item);
        }
    }
}
```

-----

## Mekanisme Probabilitas (Chance)

Setiap penarikan menghasilkan angka acak antara **1 hingga 100**. Angka ini menentukan item yang didapatkan sesuai dengan logika *if-else* berikut:

| Item | Kondisi Chance | Probabilitas | Keterangan |
| :--- | :--- | :--- | :--- |
| **Pedang** | `chance <= 40` | **40%** | Didapatkan jika angka acak adalah 1 sampai 40. |
| **Shovel** | `chance <= 50` | **10%** | Didapatkan jika angka acak adalah 41 sampai 50. |
| **Potion** | `chance > 50` | **50%** | Didapatkan jika angka acak adalah 51 sampai 100. |

-----

## Contoh Output

Karena program ini menggunakan angka acak, hasil penarikan akan **berbeda setiap kali dijalankan**.

Berikut adalah contoh hasil yang mungkin didapatkan dari 10 kali penarikan:

```
Item yang di dapatkan: Potion
Item yang di dapatkan: Pedang
Item yang di dapatkan: Potion
Item yang di dapatkan: Pedang
Item yang di dapatkan: Shovel
Item yang di dapatkan: Potion
Item yang di dapatkan: Pedang
Item yang di dapatkan: Potion
Item yang di dapatkan: Potion
Item yang di dapatkan: Pedang
```
