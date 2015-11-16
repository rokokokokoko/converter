import java.io.BufferedReader
import java.io.Reader
import java.io.Writer

object Converter {

    fun convert(reader: Reader, writer: Writer) {

        val lineSeq = BufferedReader(reader).lineSequence()

        lineSeq.forEach { l ->

            val l1 = l.drop(1).dropLast(1)

            val l2 = l1.split(";").joinToString { ", " }

            val l3 = l2.replace("-", "_")

            writer.write(l3)

        }

    }

}
