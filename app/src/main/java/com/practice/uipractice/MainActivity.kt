package com.practice.uipractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener {
//        로그인버튼이 눌리면 할일 지정

          Log.d("로그인버튼", "버튼 클릭됨")

            Toast.makeText(this, "버튼눌려쪙", Toast.LENGTH_SHORT).show()
    }

//        break 깨고 나오다

        loginBtn.setOnLongClickListener {
            Log.d("로그인버튼","버튼을 길게 누름")

            return@setOnLongClickListener false
//            return@함수이름 -> 해당함수의 결과로 설정 명시시
//            리턴트루 롱클릭만처리 / 펄스는 일반클릭도 같이 실행
        }
    }
}
