fun main(args: Array<String>) {
    while (true){
        println("Kalkulator")
        println("Pilih Proses Matematika\n1. Penjumlahan\n2. Pengurangan\n3. Perkalian")
        println("Pilihan kamu: ")
        val pilihan = readLine()
        //proses penjumlahan
        if(pilihan.toString() == "1"){
            println("Masukan angka awal : ")
            val angkaAwal = readLine()
            println("Masukan angka yang akan ditambahkan: ")
            val angkaPenambah = readLine()
            val total = angkaAwal.toString().toInt() + angkaPenambah.toString().toInt()
            println("Hasil = $total")
        }
        //proses pengurangan
        else if(pilihan.toString() == "2"){
            println("Masukan angka awal : ")
            val angkaAwal = readLine()
            println("Masukan angka yang akan dimengurangkan: ")
            val angkaPengurang = readLine()
            val total = angkaAwal.toString().toInt() - angkaPengurang.toString().toInt()
            println("Hasil = $total")
        }
        //proses perkalian
        else if(pilihan.toString() == "3"){
            println("Masukan angka awal : ")
            val angkaAwal = readLine()
            println("Masukan angka yang akan dimengalikan: ")
            val angkaPengali = readLine()
            val total = angkaAwal.toString().toInt() * angkaPengali.toString().toInt()
            println("Hasil = $total")
        }
    }
}