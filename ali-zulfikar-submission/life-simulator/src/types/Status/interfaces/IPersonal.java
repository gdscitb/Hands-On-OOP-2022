package types.Status.interfaces;

public interface IPersonal {
    /**
     *
     * @return The name of the human.
     */
    String getName();
    /**
     *
     * @param name The name of the human.
     */
    void setName(String name);
    /**
     *
     * @return The surname of the human.
     */
    String getSurname();
    /**
     *
     * @param surname The surname of the human.
     */
    void setSurname(String surname);
    /**
     *
     * @return The age of the human.
     */
    int getAge();
    /**
     *
     * @param age The age of the human.
     */
    void setAge(int age);
    /**
     *
     * @return The married status of the human.
     */
    boolean isMarried();
    /**
     *
     * @param married The married status of the human.
     */
    void setMarried(boolean married);
    /**
     *
     * @return The education of the human.
     */
    String getEducation();
    /**
     *
     * @param education The education of the human.
     */
    void setEducation(String education);

    /**
     * @apiNote This method is used to get the identity of the human.
     */
    void getIdentity();
}
