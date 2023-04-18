package com.example.s1100390.count2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var count:Int = 0
    var word:String = ""
    lateinit var txv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txv = findViewById(R.id.txv)
    }

    fun AddOne(v:View) {
        if(v.id == R.id.btn) {
            count++
            if(count==1) {
                word = "我叫江祐丞，目前就讀靜宜大學資訊管理學系二年級"
            }
            if(count==2) {
                word = "我出生於苗栗縣，\n" +
                        "從小雙親的管教方式都非常的開明，\n" +
                        "很多事情也都讓我自行選擇，\n" +
                        "但同時也希望從小就開始學習自己負責任的態度，\n" +
                        "要勇於承擔自己所做的決定。"
            }
            if(count==3) {
                word = "我的興趣愛好是運動，\n" +
                        "我覺得運動能讓人放鬆，\n" +
                        "適當的發洩體力，\n" +
                        "能讓自己更好的休息，\n" +
                        "那目前我最喜歡的運動是打排球。\n" +
                        "在靜宜大學裡我也有參加系上的排球隊，\n" +
                        "雖然我不是很會打排球，\n" +
                        "但沒有任何人在一開始做一件事就能做的得心應手。"
            }
            if(count==4) {
                word = "我的學習沒有很好，\n" +
                        "在程式方面及網頁的製作也都不擅長，\n" +
                        "更甚至連這次的行動應用軟體開發都是靠朋友的幫助才能做出來，\n" +
                        "雖然我不知道未來會不會用到現在所學的東西，\n" +
                        "但我覺得多一項技能在未來就等於多一份保障。"
            }
        }
        else{
            count = 0
            word = "完結灑花"
        }
        txv.text = word

    }

}
