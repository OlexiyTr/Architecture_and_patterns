package task_6_3_1_text_editory

class TextEditorOneInstanceObject private constructor() {

    companion object {
        private var instance: TextEditorOneInstanceObject? = null
        fun getInstance(): TextEditorOneInstanceObject {
            return instance ?: run {
                instance = TextEditorOneInstanceObject()
                instance!!
            }
        }
    }
}