package com.example.mandirinewsapp


//"author": "Antonio G. Di Benedetto",
//"title": "Google Pixel Fold vs. Samsung Galaxy Z Fold 4: specs comparison - The Verge",
//"description": "Dissecting the specs of the Pixel Fold, freshly announced at Google I/O 2023, and Samsung’s Galaxy Z Fold 4. Both are $1,800 foldable phones with a lot of similarities, but here’s how they compare on paper.",
//"url": "https://www.theverge.com/23715900/google-pixel-fold-vs-samsung-galaxy-z-4-comparison-specs",
//"urlToImage": "https://cdn.vox-cdn.com/thumbor/lJMCNqI7JOxEg_s51PZXpJs63Vo=/0x0:3000x2000/1200x628/filters:focal(1500x1000:1501x1001)/cdn.vox-cdn.com/uploads/chorus_asset/file/24642390/google_pixel_fold_hands_on_1.jpg",
//"publishedAt": "2023-05-10T22:17:33Z",
//"content": "Heres how the new Google Pixel Fold stacks up to Samsungs Galaxy Z Fold 4\r\nHeres how the new Google Pixel Fold stacks up to Samsungs Galaxy Z Fold 4\r\n / There are lots of similarities aside from the … [+3820 chars]"

data class MainModel (
    val articles: ArrayList<Articles>
) {
    data class Articles (val author: String, val title: String, val urlImage: String, val publishedAt: String)
}