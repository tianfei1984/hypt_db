package cn.com.hypt.db.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MonthlyStatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MonthlyStatExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andJtMonthlyStatIdIsNull() {
            addCriterion("jt_monthly_stat_id is null");
            return (Criteria) this;
        }

        public Criteria andJtMonthlyStatIdIsNotNull() {
            addCriterion("jt_monthly_stat_id is not null");
            return (Criteria) this;
        }

        public Criteria andJtMonthlyStatIdEqualTo(Integer value) {
            addCriterion("jt_monthly_stat_id =", value, "jtMonthlyStatId");
            return (Criteria) this;
        }

        public Criteria andJtMonthlyStatIdNotEqualTo(Integer value) {
            addCriterion("jt_monthly_stat_id <>", value, "jtMonthlyStatId");
            return (Criteria) this;
        }

        public Criteria andJtMonthlyStatIdGreaterThan(Integer value) {
            addCriterion("jt_monthly_stat_id >", value, "jtMonthlyStatId");
            return (Criteria) this;
        }

        public Criteria andJtMonthlyStatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("jt_monthly_stat_id >=", value, "jtMonthlyStatId");
            return (Criteria) this;
        }

        public Criteria andJtMonthlyStatIdLessThan(Integer value) {
            addCriterion("jt_monthly_stat_id <", value, "jtMonthlyStatId");
            return (Criteria) this;
        }

        public Criteria andJtMonthlyStatIdLessThanOrEqualTo(Integer value) {
            addCriterion("jt_monthly_stat_id <=", value, "jtMonthlyStatId");
            return (Criteria) this;
        }

        public Criteria andJtMonthlyStatIdIn(List<Integer> values) {
            addCriterion("jt_monthly_stat_id in", values, "jtMonthlyStatId");
            return (Criteria) this;
        }

        public Criteria andJtMonthlyStatIdNotIn(List<Integer> values) {
            addCriterion("jt_monthly_stat_id not in", values, "jtMonthlyStatId");
            return (Criteria) this;
        }

        public Criteria andJtMonthlyStatIdBetween(Integer value1, Integer value2) {
            addCriterion("jt_monthly_stat_id between", value1, value2, "jtMonthlyStatId");
            return (Criteria) this;
        }

        public Criteria andJtMonthlyStatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("jt_monthly_stat_id not between", value1, value2, "jtMonthlyStatId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdIsNull() {
            addCriterion("vehicle_id is null");
            return (Criteria) this;
        }

        public Criteria andVehicleIdIsNotNull() {
            addCriterion("vehicle_id is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleIdEqualTo(Integer value) {
            addCriterion("vehicle_id =", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNotEqualTo(Integer value) {
            addCriterion("vehicle_id <>", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdGreaterThan(Integer value) {
            addCriterion("vehicle_id >", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vehicle_id >=", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdLessThan(Integer value) {
            addCriterion("vehicle_id <", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdLessThanOrEqualTo(Integer value) {
            addCriterion("vehicle_id <=", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdIn(List<Integer> values) {
            addCriterion("vehicle_id in", values, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNotIn(List<Integer> values) {
            addCriterion("vehicle_id not in", values, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdBetween(Integer value1, Integer value2) {
            addCriterion("vehicle_id between", value1, value2, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vehicle_id not between", value1, value2, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andOccurMonthIsNull() {
            addCriterion("occur_month is null");
            return (Criteria) this;
        }

        public Criteria andOccurMonthIsNotNull() {
            addCriterion("occur_month is not null");
            return (Criteria) this;
        }

        public Criteria andOccurMonthEqualTo(Date value) {
            addCriterion("occur_month =", value, "occurMonth");
            return (Criteria) this;
        }

        public Criteria andOccurMonthNotEqualTo(Date value) {
            addCriterion("occur_month <>", value, "occurMonth");
            return (Criteria) this;
        }

        public Criteria andOccurMonthGreaterThan(Date value) {
            addCriterion("occur_month >", value, "occurMonth");
            return (Criteria) this;
        }

        public Criteria andOccurMonthGreaterThanOrEqualTo(Date value) {
            addCriterion("occur_month >=", value, "occurMonth");
            return (Criteria) this;
        }

        public Criteria andOccurMonthLessThan(Date value) {
            addCriterion("occur_month <", value, "occurMonth");
            return (Criteria) this;
        }

        public Criteria andOccurMonthLessThanOrEqualTo(Date value) {
            addCriterion("occur_month <=", value, "occurMonth");
            return (Criteria) this;
        }

        public Criteria andOccurMonthIn(List<Date> values) {
            addCriterion("occur_month in", values, "occurMonth");
            return (Criteria) this;
        }

        public Criteria andOccurMonthNotIn(List<Date> values) {
            addCriterion("occur_month not in", values, "occurMonth");
            return (Criteria) this;
        }

        public Criteria andOccurMonthBetween(Date value1, Date value2) {
            addCriterion("occur_month between", value1, value2, "occurMonth");
            return (Criteria) this;
        }

        public Criteria andOccurMonthNotBetween(Date value1, Date value2) {
            addCriterion("occur_month not between", value1, value2, "occurMonth");
            return (Criteria) this;
        }

        public Criteria andFuelIncountIsNull() {
            addCriterion("fuel_incount is null");
            return (Criteria) this;
        }

        public Criteria andFuelIncountIsNotNull() {
            addCriterion("fuel_incount is not null");
            return (Criteria) this;
        }

        public Criteria andFuelIncountEqualTo(BigDecimal value) {
            addCriterion("fuel_incount =", value, "fuelIncount");
            return (Criteria) this;
        }

        public Criteria andFuelIncountNotEqualTo(BigDecimal value) {
            addCriterion("fuel_incount <>", value, "fuelIncount");
            return (Criteria) this;
        }

        public Criteria andFuelIncountGreaterThan(BigDecimal value) {
            addCriterion("fuel_incount >", value, "fuelIncount");
            return (Criteria) this;
        }

        public Criteria andFuelIncountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fuel_incount >=", value, "fuelIncount");
            return (Criteria) this;
        }

        public Criteria andFuelIncountLessThan(BigDecimal value) {
            addCriterion("fuel_incount <", value, "fuelIncount");
            return (Criteria) this;
        }

        public Criteria andFuelIncountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fuel_incount <=", value, "fuelIncount");
            return (Criteria) this;
        }

        public Criteria andFuelIncountIn(List<BigDecimal> values) {
            addCriterion("fuel_incount in", values, "fuelIncount");
            return (Criteria) this;
        }

        public Criteria andFuelIncountNotIn(List<BigDecimal> values) {
            addCriterion("fuel_incount not in", values, "fuelIncount");
            return (Criteria) this;
        }

        public Criteria andFuelIncountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fuel_incount between", value1, value2, "fuelIncount");
            return (Criteria) this;
        }

        public Criteria andFuelIncountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fuel_incount not between", value1, value2, "fuelIncount");
            return (Criteria) this;
        }

        public Criteria andFeeIncountIsNull() {
            addCriterion("fee_incount is null");
            return (Criteria) this;
        }

        public Criteria andFeeIncountIsNotNull() {
            addCriterion("fee_incount is not null");
            return (Criteria) this;
        }

        public Criteria andFeeIncountEqualTo(BigDecimal value) {
            addCriterion("fee_incount =", value, "feeIncount");
            return (Criteria) this;
        }

        public Criteria andFeeIncountNotEqualTo(BigDecimal value) {
            addCriterion("fee_incount <>", value, "feeIncount");
            return (Criteria) this;
        }

        public Criteria andFeeIncountGreaterThan(BigDecimal value) {
            addCriterion("fee_incount >", value, "feeIncount");
            return (Criteria) this;
        }

        public Criteria andFeeIncountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fee_incount >=", value, "feeIncount");
            return (Criteria) this;
        }

        public Criteria andFeeIncountLessThan(BigDecimal value) {
            addCriterion("fee_incount <", value, "feeIncount");
            return (Criteria) this;
        }

        public Criteria andFeeIncountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fee_incount <=", value, "feeIncount");
            return (Criteria) this;
        }

        public Criteria andFeeIncountIn(List<BigDecimal> values) {
            addCriterion("fee_incount in", values, "feeIncount");
            return (Criteria) this;
        }

        public Criteria andFeeIncountNotIn(List<BigDecimal> values) {
            addCriterion("fee_incount not in", values, "feeIncount");
            return (Criteria) this;
        }

        public Criteria andFeeIncountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee_incount between", value1, value2, "feeIncount");
            return (Criteria) this;
        }

        public Criteria andFeeIncountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee_incount not between", value1, value2, "feeIncount");
            return (Criteria) this;
        }

        public Criteria andMileageIncountIsNull() {
            addCriterion("mileage_incount is null");
            return (Criteria) this;
        }

        public Criteria andMileageIncountIsNotNull() {
            addCriterion("mileage_incount is not null");
            return (Criteria) this;
        }

        public Criteria andMileageIncountEqualTo(BigDecimal value) {
            addCriterion("mileage_incount =", value, "mileageIncount");
            return (Criteria) this;
        }

        public Criteria andMileageIncountNotEqualTo(BigDecimal value) {
            addCriterion("mileage_incount <>", value, "mileageIncount");
            return (Criteria) this;
        }

        public Criteria andMileageIncountGreaterThan(BigDecimal value) {
            addCriterion("mileage_incount >", value, "mileageIncount");
            return (Criteria) this;
        }

        public Criteria andMileageIncountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mileage_incount >=", value, "mileageIncount");
            return (Criteria) this;
        }

        public Criteria andMileageIncountLessThan(BigDecimal value) {
            addCriterion("mileage_incount <", value, "mileageIncount");
            return (Criteria) this;
        }

        public Criteria andMileageIncountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mileage_incount <=", value, "mileageIncount");
            return (Criteria) this;
        }

        public Criteria andMileageIncountIn(List<BigDecimal> values) {
            addCriterion("mileage_incount in", values, "mileageIncount");
            return (Criteria) this;
        }

        public Criteria andMileageIncountNotIn(List<BigDecimal> values) {
            addCriterion("mileage_incount not in", values, "mileageIncount");
            return (Criteria) this;
        }

        public Criteria andMileageIncountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mileage_incount between", value1, value2, "mileageIncount");
            return (Criteria) this;
        }

        public Criteria andMileageIncountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mileage_incount not between", value1, value2, "mileageIncount");
            return (Criteria) this;
        }

        public Criteria andUrgentBrakeIsNull() {
            addCriterion("urgent_brake is null");
            return (Criteria) this;
        }

        public Criteria andUrgentBrakeIsNotNull() {
            addCriterion("urgent_brake is not null");
            return (Criteria) this;
        }

        public Criteria andUrgentBrakeEqualTo(Integer value) {
            addCriterion("urgent_brake =", value, "urgentBrake");
            return (Criteria) this;
        }

        public Criteria andUrgentBrakeNotEqualTo(Integer value) {
            addCriterion("urgent_brake <>", value, "urgentBrake");
            return (Criteria) this;
        }

        public Criteria andUrgentBrakeGreaterThan(Integer value) {
            addCriterion("urgent_brake >", value, "urgentBrake");
            return (Criteria) this;
        }

        public Criteria andUrgentBrakeGreaterThanOrEqualTo(Integer value) {
            addCriterion("urgent_brake >=", value, "urgentBrake");
            return (Criteria) this;
        }

        public Criteria andUrgentBrakeLessThan(Integer value) {
            addCriterion("urgent_brake <", value, "urgentBrake");
            return (Criteria) this;
        }

        public Criteria andUrgentBrakeLessThanOrEqualTo(Integer value) {
            addCriterion("urgent_brake <=", value, "urgentBrake");
            return (Criteria) this;
        }

        public Criteria andUrgentBrakeIn(List<Integer> values) {
            addCriterion("urgent_brake in", values, "urgentBrake");
            return (Criteria) this;
        }

        public Criteria andUrgentBrakeNotIn(List<Integer> values) {
            addCriterion("urgent_brake not in", values, "urgentBrake");
            return (Criteria) this;
        }

        public Criteria andUrgentBrakeBetween(Integer value1, Integer value2) {
            addCriterion("urgent_brake between", value1, value2, "urgentBrake");
            return (Criteria) this;
        }

        public Criteria andUrgentBrakeNotBetween(Integer value1, Integer value2) {
            addCriterion("urgent_brake not between", value1, value2, "urgentBrake");
            return (Criteria) this;
        }

        public Criteria andUrgentAccelerateIsNull() {
            addCriterion("urgent_accelerate is null");
            return (Criteria) this;
        }

        public Criteria andUrgentAccelerateIsNotNull() {
            addCriterion("urgent_accelerate is not null");
            return (Criteria) this;
        }

        public Criteria andUrgentAccelerateEqualTo(Integer value) {
            addCriterion("urgent_accelerate =", value, "urgentAccelerate");
            return (Criteria) this;
        }

        public Criteria andUrgentAccelerateNotEqualTo(Integer value) {
            addCriterion("urgent_accelerate <>", value, "urgentAccelerate");
            return (Criteria) this;
        }

        public Criteria andUrgentAccelerateGreaterThan(Integer value) {
            addCriterion("urgent_accelerate >", value, "urgentAccelerate");
            return (Criteria) this;
        }

        public Criteria andUrgentAccelerateGreaterThanOrEqualTo(Integer value) {
            addCriterion("urgent_accelerate >=", value, "urgentAccelerate");
            return (Criteria) this;
        }

        public Criteria andUrgentAccelerateLessThan(Integer value) {
            addCriterion("urgent_accelerate <", value, "urgentAccelerate");
            return (Criteria) this;
        }

        public Criteria andUrgentAccelerateLessThanOrEqualTo(Integer value) {
            addCriterion("urgent_accelerate <=", value, "urgentAccelerate");
            return (Criteria) this;
        }

        public Criteria andUrgentAccelerateIn(List<Integer> values) {
            addCriterion("urgent_accelerate in", values, "urgentAccelerate");
            return (Criteria) this;
        }

        public Criteria andUrgentAccelerateNotIn(List<Integer> values) {
            addCriterion("urgent_accelerate not in", values, "urgentAccelerate");
            return (Criteria) this;
        }

        public Criteria andUrgentAccelerateBetween(Integer value1, Integer value2) {
            addCriterion("urgent_accelerate between", value1, value2, "urgentAccelerate");
            return (Criteria) this;
        }

        public Criteria andUrgentAccelerateNotBetween(Integer value1, Integer value2) {
            addCriterion("urgent_accelerate not between", value1, value2, "urgentAccelerate");
            return (Criteria) this;
        }

        public Criteria andFuelPer100kmIsNull() {
            addCriterion("fuel_per_100km is null");
            return (Criteria) this;
        }

        public Criteria andFuelPer100kmIsNotNull() {
            addCriterion("fuel_per_100km is not null");
            return (Criteria) this;
        }

        public Criteria andFuelPer100kmEqualTo(BigDecimal value) {
            addCriterion("fuel_per_100km =", value, "fuelPer100km");
            return (Criteria) this;
        }

        public Criteria andFuelPer100kmNotEqualTo(BigDecimal value) {
            addCriterion("fuel_per_100km <>", value, "fuelPer100km");
            return (Criteria) this;
        }

        public Criteria andFuelPer100kmGreaterThan(BigDecimal value) {
            addCriterion("fuel_per_100km >", value, "fuelPer100km");
            return (Criteria) this;
        }

        public Criteria andFuelPer100kmGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fuel_per_100km >=", value, "fuelPer100km");
            return (Criteria) this;
        }

        public Criteria andFuelPer100kmLessThan(BigDecimal value) {
            addCriterion("fuel_per_100km <", value, "fuelPer100km");
            return (Criteria) this;
        }

        public Criteria andFuelPer100kmLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fuel_per_100km <=", value, "fuelPer100km");
            return (Criteria) this;
        }

        public Criteria andFuelPer100kmIn(List<BigDecimal> values) {
            addCriterion("fuel_per_100km in", values, "fuelPer100km");
            return (Criteria) this;
        }

        public Criteria andFuelPer100kmNotIn(List<BigDecimal> values) {
            addCriterion("fuel_per_100km not in", values, "fuelPer100km");
            return (Criteria) this;
        }

        public Criteria andFuelPer100kmBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fuel_per_100km between", value1, value2, "fuelPer100km");
            return (Criteria) this;
        }

        public Criteria andFuelPer100kmNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fuel_per_100km not between", value1, value2, "fuelPer100km");
            return (Criteria) this;
        }

        public Criteria andFeePer100kmIsNull() {
            addCriterion("fee_per_100km is null");
            return (Criteria) this;
        }

        public Criteria andFeePer100kmIsNotNull() {
            addCriterion("fee_per_100km is not null");
            return (Criteria) this;
        }

        public Criteria andFeePer100kmEqualTo(BigDecimal value) {
            addCriterion("fee_per_100km =", value, "feePer100km");
            return (Criteria) this;
        }

        public Criteria andFeePer100kmNotEqualTo(BigDecimal value) {
            addCriterion("fee_per_100km <>", value, "feePer100km");
            return (Criteria) this;
        }

        public Criteria andFeePer100kmGreaterThan(BigDecimal value) {
            addCriterion("fee_per_100km >", value, "feePer100km");
            return (Criteria) this;
        }

        public Criteria andFeePer100kmGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fee_per_100km >=", value, "feePer100km");
            return (Criteria) this;
        }

        public Criteria andFeePer100kmLessThan(BigDecimal value) {
            addCriterion("fee_per_100km <", value, "feePer100km");
            return (Criteria) this;
        }

        public Criteria andFeePer100kmLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fee_per_100km <=", value, "feePer100km");
            return (Criteria) this;
        }

        public Criteria andFeePer100kmIn(List<BigDecimal> values) {
            addCriterion("fee_per_100km in", values, "feePer100km");
            return (Criteria) this;
        }

        public Criteria andFeePer100kmNotIn(List<BigDecimal> values) {
            addCriterion("fee_per_100km not in", values, "feePer100km");
            return (Criteria) this;
        }

        public Criteria andFeePer100kmBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee_per_100km between", value1, value2, "feePer100km");
            return (Criteria) this;
        }

        public Criteria andFeePer100kmNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee_per_100km not between", value1, value2, "feePer100km");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}