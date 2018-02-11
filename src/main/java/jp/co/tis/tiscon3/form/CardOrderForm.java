package jp.co.tis.tiscon3.form;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class CardOrderForm extends FormBase {

    private static final long serialVersionUID = 1L;

    @NotBlank(message="お名前（漢字）を正しく入力してください")
    @Size(max = 60, message = "お名前（漢字）を正しく入力してください")
    private String kanjiName;

    @NotBlank(message="お名前（カナ）を正しく入力してください")
    @Size(max = 90,message="お名前（カナ）を正しく入力してください")
    @Pattern(regexp = "^[ァ-ヶー 　]*$",message="お名前（カナ）を正しく入力してください")
    private String kanaName;

    @NotBlank(message="お名前（アルファベット)を正しく入力してください（半角英数字）")
    @Size(max = 120,message="お名前（アルファベット)を正しく入力してください（半角英数字）")
    @Pattern(regexp = "^[a-zA-Z 　]*$",message="お名前（アルファベット)を正しく入力してください（半角英数字）")
    private String alphabetName;

    @NotBlank(message="誕生日を正しく入力してください（半角英数字）")
    @Size(max = 10,message="誕生日を正しく入力してください（半角英数字）")
    @Pattern(regexp = "\\d{4}/\\d{1,2}/\\d{1,2}$",message="誕生日を正しく入力してください（半角英数字）")
    private String dateOfBirth;

    @NotBlank(message="性別を正しく選択してください")
    @Size(max = 6,message="性別を正しく選択してください")
    private String gender;

    @NotBlank(message="郵便番号を正しく入力してください（半角英数字）")
    @Size(max = 8,message="郵便番号を正しく入力してください（半角英数字）")
    @Pattern(regexp = "^[0-9]{3}-[0-9]{4}$",message="郵便番号を正しく入力してください（半角英数字）")
    private String zipCode;

    @NotBlank(message="ご住所を正しく入力してください")
    @Size(max = 255,message="ご住所を正しく入力してください")
    private String address;

    @NotBlank(message="自宅電話番号を正しく入力してください（半角英数字）")
    @Size(max = 13,message="自宅電話番号を正しく入力してください（半角英数字）")
    @Pattern(regexp = "^0[0-9]{1,3}-[0-9]{2,4}-[0-9]{4}$",message="自宅電話番号を正しく入力してください（半角英数字）")
    private String homePhoneNumber;

    @Size(max = 13,message="携帯電話番号を正しく入力してください（半角英数字）")
    @Pattern(regexp = "^((070|080|090)-[0-9]{4}-[0-9]{4})?$",message="携帯電話番号を正しく入力してください（半角英数字）")
    private String mobilePhoneNumber;

    @NotBlank(message="メールアドレスを正しく入力してください")
    @Size(max = 255,message="メールアドレスを正しく入力してください")
    @Email
    private String emailAddress;

    @NotBlank(message="配偶者有無を正しく選択してください")
    @Size(max = 20,message="配偶者有無を正しく選択してください")
    private String spouse;

    @NotBlank(message="お住まいを正しく入力してください")
    @Size(max = 20,message="お住まいを正しく入力してください")
    private String houseClassification;

    @NotBlank(message="ローン等のお借り入れ金額を正しく入力してください")
    @Size(max = 6,message="ローン等のお借り入れ金額を正しく入力してください")
    @Pattern(regexp = "[0-9]*",message="ローン等のお借り入れ金額を正しく入力してください")
    private String debt;

    @NotBlank(message="ご職業を正しく入力してください")
    @Size(max = 120,message="ご職業を正しく入力してください")
    private String job;

    @NotBlank(message="昨年の所得を正しく入力してください")
    @Size(max = 6,message="昨年の所得を正しく入力してください")
    @Pattern(regexp = "[0-9]*",message="昨年の所得を正しく入力してください")
    private String income;

    @Size(max = 255,message="お勤め先を正しく入力してください")
    private String employerName;

    @Size(max = 8)
    @Pattern(regexp = "^([0-9]{3}-[0-9]{4})?$")
    private String employerZipCode;

    @Size(max = 255)
    private String employerAddress;

    @Size(max = 13)
    @Pattern(regexp = "^(0[0-9]{1,3}-[0-9]{2,4}-[0-9]{4})?$")
    private String employerPhoneNumber;

    @Size(max = 255)
    private String industryType;

    @Size(max = 6)
    @Pattern(regexp = "[0-9]*")
    private String capital;

    @Size(max = 255)
    @Pattern(regexp = "[0-9]*")
    private String companySize;

    @Size(max = 255)
    private String position;

    @Size(max = 255)
    private String department;

    @Size(max = 6)
    @Pattern(regexp = "[0-9]*")
    private String employeeLength;

}
