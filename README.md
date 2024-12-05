# Medication Management System

This Java project simulates a medication management system for a pharmacy. It allows for managing different types of medications, including their details such as name, reference, price, and manufacture date. It also supports calculating taxes based on medication types and offers reimbursement options for certain medications.

## Project Structure
### Medicaments
##### medicament.java (Abstract base class for medications)
##### AntiInflammatoire.java (Anti-inflammatory medication class)
##### antibiotiques.java (Antibiotic medication class)
##### homéopathiques.java (Homeopathic medication class)
##### Pharmacie.java (Pharmacy class that manages medications)
##### Remboursable.java (Interface for reimbursable medications)
##### Test.java (Test class to demonstrate usage)

## Classes Overview

### 1. **`medicament` Class (Abstract Class)**
The `medicament` class serves as a base class for all types of medications. It defines common attributes and methods that all specific medication types inherit and build upon.

#### **Attributes:**
- **`String libelle`**: The name of the medication.
- **`int reference`**: A unique reference number for the medication.
- **`float prix`**: The price of the medication.
- **`String datefabrication`**: The date the medication was manufactured.

#### **Methods:**
- **`float calculTaxeAppliquee()`**: An abstract method that must be implemented by subclasses to calculate the applicable tax on the medication.
- **`String toString()`**: Provides a string representation of the medication, including its name, reference, price, and manufacture date.

---

### 2. **`Pharmacie` Class**
The `Pharmacie` class manages a collection of medications (`medicament` objects). It allows adding, searching, deleting, and displaying medications based on categories.

#### **Attributes:**
- **`medicament[] lesMedicaments`**: An array to store the medications in the pharmacy.
- **`int nbMedicaments`**: The number of medications in the pharmacy.

#### **Methods:**
- **`void ajoute(medicament medicament)`**: Adds a medication to the pharmacy.
- **`int recherche(int reference)`**: Searches for a medication by its reference number.
- **`void supprime(int reference)`**: Deletes a medication by its reference number.
- **`void affiche(String categorie)`**: Displays all medications of a given category.

---

### 3. **`AntiInflammatoire` Class**
The `AntiInflammatoire` class extends the `medicament` class and implements the `Remboursable` interface. It represents anti-inflammatory medications.

#### **Attributes:**
- **`String molecule`**: The type of molecule used in the anti-inflammatory medication (e.g., steroidal, non-steroidal).
- **`int acidite`**: The acidity level of the medication.

#### **Methods:**
- **`float calculTaxeAppliquee()`**: Calculates the tax based on the molecule type.
- **`float remboursemant()`**: Calculates the reimbursement price (80% off the original price).
- **`String toString()`**: Returns a string representation of the anti-inflammatory medication.

---

### 4. **`homéopathiques` Class**
The `homéopathiques` class represents homeopathic medications. It extends the `medicament` class and calculates taxes specific to homeopathic drugs.

#### **Attributes:**
- **`String plante`**: The plant used in the homeopathic medication.

#### **Methods:**
- **`float calculTaxeAppliquee()`**: Calculates the tax (20% off the price for homeopathic medications).
- **`String toString()`**: Returns a string representation of the homeopathic medication.

---

### 5. **`Remboursable` Interface**
The `Remboursable` interface defines the method for medications that can be reimbursed by a percentage of the price.

#### **Methods:**
- **`float remboursemant()`**: Method to calculate the reimbursement price.

---

## **Test Class Overview**

The `Test` class demonstrates the functionality of the Medication Management System. It shows how to create instances of different types of medications (`AntiInflammatoire`, `antibiotiques`, and `homéopathiques`), add them to a pharmacy, and calculate taxes and reimbursements.

### **Key Steps in the Test Class:**
1. **Creating Medications**: 
   - Various medication instances are created using their respective constructors (e.g., `AntiInflammatoire`, `antibiotiques`, `homéopathiques`).
2. **Displaying Medication Details**:
   - Each medication's details are displayed, including its name, price, reference number, and tax calculations.
3. **Calculating Tax and Reimbursement**:
   - The `calculTaxeAppliquee()` method calculates the tax for each medication.
   - For reimbursable medications, the `remboursemant()` method calculates the reimbursement price.
4. **Creating and Using the Pharmacy**:
   - Medications are added to a `Pharmacie` object.
   - The `affiche()` method is used to display medications by category (e.g., "antibiotiques").

---

## **How to Use the System**

1. Clone or download the project repository.
2. Compile the Java files using your preferred Java compiler or IDE.
3. Run the `Test` class to see how medications are created, added to the pharmacy, and displayed.
4. Modify the `Test` class to add more medications, adjust prices, or test different features like tax calculation and reimbursement.

---

## **Example Output**

```plaintext
AntiInflammatoire[libelle=Anti-inflammatory 1, reference=101, prix=50.0, datefabrication=2023-01-01, molecule=stéroïdien, acidite=3]
Taxe appliquée: 5.0
Remboursement: 40.0

homéopathiques[libelle=Homeopathic 1, reference=102, prix=30.0, datefabrication=2023-02-01, plante=Echinacea]
Taxe appliquée: 6.0
Non Remboursable

Pharmacie Inventory:
- Anti-inflammatory 1
- Homeopathic 1

