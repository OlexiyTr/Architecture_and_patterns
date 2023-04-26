package task_8_3_2_bridge_refactoring.task_3_2.src;

public class Canvas {

  public static void main(String[] args) {

    CheckboxButton checkboxButton = new SmallCheckboxButton();
    checkboxButton.draw();

    RadioButton radioButton = new MediumRadioButton();
    radioButton.draw();

    DropdownButton dropdownButton = new LargeDropdownButton();
    dropdownButton.draw();

  }

}
