package data

class Home {
    val buildingArea = 100
    val totalRooms = 4

    inner class Room{
        val totalRooms = 4
        fun measureRoomArea(){
            print(buildingArea/this@Home.totalRooms)
        }

    }
}