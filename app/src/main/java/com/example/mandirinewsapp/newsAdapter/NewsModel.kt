package com.example.mandirinewsapp.newsAdapter
import com.example.mandirinewsapp.R


data class news(var title: String, var desc: String, var photo: Int)

object NewsModel {
    val newslist = listOf<news>(
        news(
            "BSI Kena Serangan Ransomware, Erick Thohir Buka Suara - CNBC Indonesia",
            "CNBC Indonesia | 2023-05-10",
            R.drawable.img_news6
        ),

        news(
            "Kekuatan Gempa dan Tsunami Terkait Temuan Gelembung Patahan Bumi - SINDOnews Sains",
            "SINDOnews Sains | 2023-05-10",
            R.drawable.img_news2
        ),

        news(
            "Bulu Tangkis SEA Games 2023 - Maaf Thailand, Malaysia Tantang Indonesia di Final - Bolasport",
            "Bolasport | 2023-05-10",
            R.drawable.img_news3
        ),

        news(
            "Ditemukan 89 Kasus Sifilis di DI Yogyakarta Hingga Maret 2023 - Tribun Jogja",
            "Tribun Jogja | 2023-05-10",
            R.drawable.img_news4
        ),

        news(
            "Tampang Husen Tersenyum Ceritakan Momen Mutilasi Bos Depot Air Isi Ulang - detikNews",
            "detikNews | 2023-05-10",
            R.drawable.img_news5
        ),

        news(
            "Spesifikasi Oppo Find N2 Flip, Ponsel Lipat Baru Meluncur Hari Ini - Tribun Jateng",
            "Tribun Jateng | 2023-05-10",
            R.drawable.img_news1
        ),

        news(
            "Disentil OJK Karena Agen Nakal, Sinarmas MSIG Bilang Begini - detikFinance",
            "detikFinance | 2023-05-10",
            R.drawable.img_news7
        ),

        news(
            "Milan Vs Inter: Berat buat Rossoneri Kalau Tanpa Leao - detikSport",
            "detikSport | 2023-05-10",
            R.drawable.img_news8
        ),

        news(
            "Klasemen SEA Games 2023: Pencak Silat Raih 14 Medali untuk Indonesia - Kompas.com - KOMPAS.com",
            "KOMPAS.com | 2023-05-10",
            R.drawable.img_news_headline
        )
    )
}