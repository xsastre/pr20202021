package primerdam.xaviersastre.programacio.primeravaluacio.exemplesclasseobjectes;

/*
 *       Filename:  Persona
 *
 *    Description:  Modelitza una persona. Una persona té edat, alçada, sexe i pot estar casada o no.
 *                  // Modelizes a person. The person has age, height, sex and can be married or not.
 *
 *        Created:  14 nov. 2020
 *       Revision:  none
 *
 *        @Author:  xavier - xavier.sastre@cide.es
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class Persona {

        /** Nom de la persona ENG: The person's name */
        private String nom;
        /** Edat de la persona ENG: The person's age */
        private int edat;
        /** Alçada de la persona ENG: The person's height */
        private double alsada;
        /** El sexe d'una persona. Pot ser 'H' (home) o 'D' (dona).
         * TENG: he person's sex. It can be 'H' (man) or 'H' (woman) */
        private char sexe;
        /** Estableix si una persona està casada o no.
         * ENG: Sets whether the person is married or not */
        private boolean casada;

        // Constructors

        /**
         * Constructor per defecte ENG: Constructor by default.
         */
        public Persona() {
            this.casada = true;
        }

        /**
         * Constructor.
         *
         * @param nom nom de la persona ENG: the person's name.
         */
        public Persona(String nom) {
            this.nom = nom;
        }

        /**
         * Constructor.
         *
         * @param nom nom de la persona ENG: the person's name.
         * @param edat edat de la persona ENG: the person's age.
         * @param alsada alsada de la persona ENG: the person's height
         * @param sexe sexe de la persona Pot ser 'H' (home o 'D' (dona)
         *             ENG: the person's sex. It can be 'H' (man) or 'D' (woman).
         * @param casada true si la persona està casada, false altrament
         *               ENG: true if the person is married, false otherwise
         */
        public Persona(String nom, int edat, double alsada, char sexe, boolean casada) {
            this.nom = nom;
            this.setEdat(edat);
            this.alsada = alsada;
            this.sexe = sexe;
            this.casada = casada;
        }

        // Getters and setters

        /**
         * Obté el nom de la persona; ENG: Gets the person's name.
         *
         * @return el nom de la persona.
         *         ENG: the person's name.
         */
        public String getNom() {
            return this.nom;
        }

        /**
         * Estableix l'edat de la persona; ENG: Sets the person's name.
         *
         * @param nom l'edat de la persona.
         *            ENG: the person's name.
         */
        public void setNom(String nom) {
            this.nom = nom;
        }

        /**
         * Obté l'edat de la persona; ENG: Gets person's age.
         *
         * @return l'edat de la persona.
         *         ENG: the person's age.
         */
        public int getEdat() {
            return edat;
        }

        /**
         * Estableix l'edat de la persona; ENG: Sets the person's age.
         *
         * @param edat l'edat de la persona.
         *             ENG: the person's age.
         */
        public void setEdat(int edat) {
            if (edat >= 0)
                this.edat = edat;
        }

        /**
         * Obté l'alçada de la persona; ENG: Gets the height of the person.
         *
         * @return l'alçada de la persona.
         *         ENG: the person's height.
         */
        public double getAlsada() {
            return alsada;
        }

        /**
         * Estableix l'alçada de la persona; ENG: Sets the person's height.
         *
         * @param alsada l'alçada de la persona.
         *               ENG: the person's height.
         */
        public void setAlsada(double alsada) {
            this.alsada = alsada;
        }

        /**
         * Obté el sexe de la persona; ENG: Gets the sex of the person.
         *
         * @return el sexe de la persona.
         *          ENG: the person's sex.
         */
        public char getSexe() {
            return sexe;
        }

        /**
         * Estableix el sexe de la persona; ENG: Sets the person's sex.
         *
         * @param sexe el sexe de la persona.
         *             ENG: the person's sex.
         */
        public void setSexe(char sexe) {
            if (sexe == 'D' || sexe == 'H')
                this.sexe = sexe;
        }

        /**
         * Obté si la persona està casada; ENG: Gets if the person is married.
         *
         * @return true si la persona està casada, false altrament.
         *          ENG: true if he/she is married, false otherwise
         */
        public boolean estaCasada() {
            return casada;
        }

        /**
         * Estableix si una persona està casada o no; ENG: Sets if person is married.
         *
         * @param casada true si la persona està casada, false altrament
         *               ENG: true if the person is married, false otherwise
         */
        public void setCasada(boolean casada) {
            this.casada = casada;
        }

        // Més mètodes // More methods

        /**
         * Incrementa l'edat d'una persona en 1; ENG: Increments person's age by 1.
         */
        public void aniversari() {
            this.edat++;
        }

        /**
         * Representació textual de l'objecte; ENG: Textual representation of the object.
         *
         * @return un string que representa a una persona
         *          ENG: a string that represents the person
         */
        public String toString() {
            String s = "El meu nom és " + this.nom + " i  sóc " + this.sexe;
            return s;
        }
    }