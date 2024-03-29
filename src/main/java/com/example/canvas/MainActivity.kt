package com.example.canvas

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.OvalShape
import android.graphics.drawable.shapes.RectShape
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Decrease the size of the bitmap
        val bitmap: Bitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888)
        val canvas: Canvas = Canvas(bitmap)

        // Rectangle positions
        var left = 50
        var top = 50
        var right = 250
        var bottom = 200

        // Draw rectangle shape to canvas
        var shapeDrawable: ShapeDrawable = ShapeDrawable(RectShape())
        shapeDrawable.setBounds(left, top, right, bottom)
        shapeDrawable.paint.color = Color.parseColor("#009944")
        shapeDrawable.draw(canvas)

        // Oval positions
        var leftt = 50
        var ttop = 250
        var rright = 250
        var bbottom = 400

        // Draw oval shape to canvas
        shapeDrawable = ShapeDrawable(OvalShape())
        shapeDrawable.setBounds(leftt, ttop, rright, bbottom)
        shapeDrawable.paint.color = Color.parseColor("#009191")
        shapeDrawable.draw(canvas)

        // Draw a circle
        val paint = Paint()
        paint.color = Color.parseColor("#FF5733")
        canvas.drawCircle(400f, 150f, 50f, paint)

        // Draw lines
        paint.color = Color.BLACK
        paint.strokeWidth = 5f

        // Horizontal line in the middle
        canvas.drawLine(0f, 250f, 500f, 250f, paint)

        // Diagonal lines
        canvas.drawLine(300f, 300f, 450f, 450f, paint)
        canvas.drawLine(450f, 300f, 300f, 450f, paint)

        val iv = findViewById<ImageView>(R.id.imageV)

        // Set bitmap as the background of ImageView
        iv.background = BitmapDrawable(resources, bitmap)
    }
}
