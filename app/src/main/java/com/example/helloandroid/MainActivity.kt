package com.example.helloandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.helloandroid.databinding.ActivityMainBinding

//  Activityクラスを継承してクラスを作成
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
//    Activityを継承してonCreateメソッドオーバーライドしています。
//    onCreateは画面が起動された時に最初に呼ばれるメソッド。onCreateでは必ず親クラスのコンストラクタを呼び出します。
//      これはAndroidのルールとなっており、呼び出さなければプログラムが正しく動作しません。
    override fun onCreate(savedInstanceState: Bundle?) {
//        Activityクラスに用意されたメソッドをオーバーライドする場合には、superを使って親クラスのメソッドを呼び出しておいてください。
//          これはActivityの各メソッドがAndroidの画面表示に関するいろいろな処理を行っているためです。
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
//        rootプロパティからルートビューへの参照を取得
        val view = binding.root
//        取得したルートビューをsetContentViewに渡す。これによりactivity_main.xmlの定義から実際のビューオブジェクトが生成されます。
        setContentView(view)

        binding.tapHere.setOnClickListener {
            binding.textView.text = "ボタンがタップされました"
        }
    }
}