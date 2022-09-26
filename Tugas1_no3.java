M. Sarhan akasah
TI21 G
20210040210

No 3. Buatlah resume(ulasan) informasi tentang versi terakhir JAVA saat ini !
Jelaskan fitur-fitur yang ditambahkan beserta kelebihan-kelebihannya

Jawab : Versi terbaru dari java (JDK) adalah versi 19
prubahan atau peningkatan yang ada di versi tersebut antaralain:

1. Konkurensi terstruktur, dalam fase inkubator, dimaksudkan untuk menyederhanakan pemrograman multithread melalui API konkurensi terstruktur. 
Konkurensi ini memperlakukan beberapa tugas yang berjalan di utas yang berbeda sebagai satu unit kerja, untuk merampingkan penanganan dan pembatalan kesalahan. 
Keandalan dan observabilitas ditingkatkan. Fitur ini berasal dari Project Loom, yang memperkenalkan model konkurensi ringan baru.

2. Pratinjau pola rekaman, untuk mendekonstruksi nilai rekaman. Pola rekaman dan pola tipe dapat disarangkan untuk mengaktifkan bentuk navigasi dan pemrosesan data 
yang deklaratif, kuat, dan dapat disusun. Sasaran proposal mencakup perluasan pencocokan pola untuk mengekspresikan kueri data yang lebih canggih dan dapat 
dikomposisi tanpa mengubah sintaks atau semantik pola tipe. Proposal ini dibuat berdasarkan pencocokan pola untuk instanceof, yang dikirimkan dalam JDK 16 pada 
Maret 2021. Rencana di masa mendatang mungkin memerlukan pola rekaman untuk diperluas dengan kemampuan seperti pola larik dan pola vararg. Pola rekaman adalah 
bagian dari Project Amber, upaya untuk mengeksplorasi dan menginkubasi fitur Java yang lebih kecil dan berorientasi pada produktivitas.

3. Pratinjau utas virtual, yang merupakan utas ringan yang secara dramatis mengurangi upaya penulisan, pemeliharaan, dan pengamatan throughput tinggi, 
aplikasi bersamaan. Sasarannya termasuk mengaktifkan aplikasi server yang ditulis dalam gaya thread-per-request sederhana untuk diskalakan dengan penggunaan 
perangkat keras yang hampir optimal, mengaktifkan kode yang ada yang menggunakan Java.lang Thread API untuk mengadopsi thread virtual dengan perubahan minimal, 
dan mengaktifkan pemecahan masalah, debugging, dan pembuatan profil utas virtual dengan alat JDK yang ada. Proposal ini bukan bertujuan untuk mengubah model 
konkurensi dasar di Java atau menawarkan konstruksi paralelisme data baru dalam bahasa Java atau pustaka Java. Juga bukan tujuan untuk menghapus implementasi 
tradisional dari utas atau memigrasikan aplikasi yang ada secara diam-diam untuk menggunakan utas virtual. Fitur ini juga merupakan bagian dari Project Loom.