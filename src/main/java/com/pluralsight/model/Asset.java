package com.pluralsight.model;

public abstract class Asset {
        protected String description, dateAcquired;
        protected double originalCost;

        public Asset(String description, String dateAcquired, double originalCost) {
            this.description = description;
            this.dateAcquired = dateAcquired;
            this.originalCost = originalCost;
        }

        public String getDescription() {
            return description;
        }

        public String getDateAcquired() {
            return dateAcquired;
        }

        public double getOriginalCost() {
            return originalCost;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setDateAcquired(String dateAcquired) {
            this.dateAcquired = dateAcquired;
        }

        public void setOriginalCost() {
            this.originalCost = originalCost;
        }
        public abstract double getValue();
//            return this.originalCost ;
        }



