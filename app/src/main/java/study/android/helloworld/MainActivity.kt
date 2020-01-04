package study.android.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.BounceInterpolator
import android.view.animation.TranslateAnimation
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Создаем объект анимации - выпадения сверху
        val translation = TranslateAnimation(0f, 0f, -1000f, 0f)
        // Устанавливаем длительность 5 секунд
        translation.duration = 5000
        // Просчитываем подпрыгивание
        translation.interpolator = BounceInterpolator()
        // Запускаем анимацию на нашей картинке
        imageView1.startAnimation(translation)
    }

}
