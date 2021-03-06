/**
 * jhChoi - 20200924
 *
 * 연산자 operator 예제
 * 객체의 사칙연산
 * */
class Point(var x: Int = 0, var y: Int = 0) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }

    operator fun minus(other: Point): Point {
        return Point(x - other.x, y - other.y)
    }

    operator fun times(other: Point): Point {
        return Point(x * other.x, y * other.y)
    }

    operator fun div(other: Point): Point {
        return Point(x / other.x, y / other.y)
    }

    fun print(){
        println("x: $x, y: $y")
    }
}

fun main(args:Array<String>){
    val currentPoint:Point = Point(1,1)
    val movePoint:Point = Point(4,3)

    //Operator 사용법 1
    val plusDstPoint = currentPoint + movePoint
    val minusDstPoint = currentPoint - movePoint
    val timesDstPoint = currentPoint * movePoint
    val divDstPoint = currentPoint / movePoint

    plusDstPoint.print()
    minusDstPoint.print()
    timesDstPoint.print()
    divDstPoint.print()

    println()
    //Operator 사용법 2
    val plusDstPoint2 = currentPoint.plus(movePoint)
    val minusDstPoint2 = currentPoint.minus(movePoint)
    val timesDstPoint2 = currentPoint.times(movePoint)
    val divDstPoint2 = currentPoint.div(movePoint)

    plusDstPoint2.print()
    minusDstPoint2.print()
    timesDstPoint2.print()
    divDstPoint2.print()
}