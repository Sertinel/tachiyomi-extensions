package eu.kanade.tachiyomi.extension.tr.grimelek

import eu.kanade.tachiyomi.multisrc.madara.Madara
import eu.kanade.tachiyomi.source.model.SChapter
import okhttp3.Response
import java.text.SimpleDateFormat
import java.util.Locale

class Siyahmelek : Madara(
    "Gri Melek",
    "https://grimelek.net/",
    "tr",
    SimpleDateFormat("MMM d, yyy", Locale("tr")),
) {
    override val versionId = 2

    override val useNewChapterEndpoint = true

    override fun chapterListParse(response: Response): List<SChapter> =
        super.chapterListParse(response).reversed()
}
