import java.io.FileReader
import java.io.FileWriter

fun main(args: Array<String>) {

    val iPath = args[0]

    val oPath = args[1]

    val reader = FileReader(iPath)

    val writer = FileWriter(oPath)

    Converter.convert(reader, writer)

}
