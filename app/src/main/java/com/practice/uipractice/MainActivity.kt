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

            val inputEmail = emailEdt.text.toString()

          Log.d("로그인버튼", "버튼 클릭됨")

            when (inputEmail){
                "admin@naver.com" -> {Toast.makeText(this,"관리자입니다", Toast.LENGTH_SHORT).show()}
                    "student" -> {Toast.makeText(this,"학생입니다", Toast.LENGTH_SHORT).show()}
                "parent" -> {Toast.makeText(this,"부모입니다", Toast.LENGTH_SHORT).show()}
                "teacher" -> {Toast.makeText(this,"선생입니다", Toast.LENGTH_SHORT).show()}
                else -> {
                    val formattedMsg = "입력한 아이디는 ${inputEmail}입니다."
                    Toast.makeText(this,formattedMsg, Toast.LENGTH_SHORT).show()
                }
            }



//            입력한 아이디가 admin@naver.com 이면, 관리자 입니다 토스트
//            student 이면 학생입니다 / parent 학부모 / teacher 학생
//            그외에는  입력한 아이디는 ? 입니다

//            if (inputEmail == "admin@naver.com"){
//                Toast.makeText(this,"관리자입니다", Toast.LENGTH_SHORT).show()
//            }
//
//            val formattedStr = "입력한 아이디는 ${inputEmail}입니다."
//
//            Toast.makeText(this, formattedStr, Toast.LENGTH_SHORT).show()
//

    }

//        break 깨고 나오다

        loginBtn.setOnLongClickListener {
//
//            로그로 0부터 5까지 숫자출력
            for (i in 0..5){

                Log.d("for문연습", "${i}")
            }


            Log.d("로그인버튼","버튼을 길게 누름")

            return@setOnLongClickListener false
//            return@함수이름 -> 해당함수의 결과로 설정 명시시
//            리턴트루 롱클릭만처리 / 펄스는 일반클릭도 같이 실행
        }
    }
}
